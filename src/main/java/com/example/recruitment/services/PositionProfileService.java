package com.example.recruitment.services;


import com.example.recruitment.models.Image;
import com.example.recruitment.models.PositionProfile;
import com.example.recruitment.models.User;
import com.example.recruitment.repositories.PositionProfileRepository;
import com.example.recruitment.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PositionProfileService {
    private final PositionProfileRepository positionProfileRepository;
    private final UserRepository userRepository;

    public List<PositionProfile> listPositionProfile(String title) {
        if (title != null) return positionProfileRepository.findByTitle(title);
        return positionProfileRepository.findAll();
    }

    public void savePositionProfile(Principal principal, PositionProfile positionProfile, MultipartFile file1, MultipartFile file2, MultipartFile file3) throws IOException {
        positionProfile.setUser(getUserByPrincipal(principal));
        Image image1;
        Image image2;
        Image image3;
        if (file1.getSize() != 0) {
            image1 = toImageEntity(file1);
            image1.setPreviewImage(true);
            positionProfile.addImageToPositionProfile(image1);
        }
        if (file2.getSize() != 0) {
            image2 = toImageEntity(file2);
            positionProfile.addImageToPositionProfile(image2);
        }
        if (file3.getSize() != 0) {
            image3 = toImageEntity(file3);
            positionProfile.addImageToPositionProfile(image3);
        }
        log.info("Saving new PositionProfile. Title: {}", positionProfile.getTitle(), positionProfile.getUser().getEmail());
        PositionProfile positionProfileFromDB = positionProfileRepository.save(positionProfile);
        positionProfileFromDB.setPreviewImageId(positionProfileFromDB.getImages().get(0).getId());
        positionProfileRepository.save(positionProfile);
    }

    public User getUserByPrincipal(Principal principal) {
        if (principal == null) return new User();
        return userRepository.findByEmail(principal.getName());
    }

    private Image toImageEntity(MultipartFile file) throws IOException {
        Image image = new Image();
        image.setName(file.getName());
        image.setOriginalFileName(file.getOriginalFilename());
        image.setContentType(file.getContentType());
        image.setSize(file.getSize());
        image.setBytes(file.getBytes());
        return image;
    }

    public void deletePositionProfile(User user, Long id) {
        PositionProfile positionProfile= positionProfileRepository.findById(id)
                .orElse(null);
        if (positionProfile != null) {
            if (positionProfile.getUser().getId().equals(user.getId())) {
                positionProfileRepository.delete(positionProfile);
                log.info("PositionProfile with id = {} was deleted", id);
            } else {
                log.error("User: {} haven't this positionProfile with id = {}", user.getEmail(), id);
            }
        } else {
            log.error("PositionProfile with id = {} is not found", id);
        }    }

    public PositionProfile getPositionProfileById(Long id) {
        return positionProfileRepository.findById(id).orElse(null);
    }
}
