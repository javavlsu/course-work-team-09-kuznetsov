package com.example.recruitment.services;


import com.example.recruitment.models.Image;
import com.example.recruitment.models.PositionProfile;
import com.example.recruitment.repositories.PositionProfileRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PositionProfileService {
    private final PositionProfileRepository positionProfileRepository;

    public List<PositionProfile> listPositionProfile() {
        return positionProfileRepository.findAll();
    }

    public void savePositionProfile(PositionProfile positionProfile, MultipartFile file1, MultipartFile file2, MultipartFile file3) throws IOException {
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
        log.info("Saving new Profile. Name Post: {}", positionProfile.getName_post());
        PositionProfile positionProfileFromDb = positionProfileRepository.save(positionProfile);
        positionProfileFromDb.setPreviewImageId(positionProfileFromDb.getImages().get(0).getId());
        positionProfileRepository.save(positionProfile);
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

    public void deletePositionProfile(Long id) {
        positionProfileRepository.deleteById(id);
    }

    public PositionProfile getPositionProfileById(Long id) {
        return positionProfileRepository.findById(id).orElse(null);
    }
}
