package trueman.KP.Java.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/Applicant")
public class ApplicantController
{
    @GetMapping("/CreatingQuestionnaire")
    public String methodCreatingQuestionnaire(Model model) throws SQLException, ClassNotFoundException{
        return "Пусто";
    }
    @GetMapping("/profileSearchPost")
    public String methodprofileSearchPost(Model model) throws SQLException, ClassNotFoundException{
        return "Пусто";
    }
}