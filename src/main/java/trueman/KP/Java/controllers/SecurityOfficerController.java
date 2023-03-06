package trueman.KP.Java.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/SecurityOfficer")
public class SecurityOfficerController {
    @GetMapping("/VerificationQuestionnaires")
    public String methodVerificationQuestionnaires(Model model) throws SQLException, ClassNotFoundException {
        return "Пусто";
    }
}