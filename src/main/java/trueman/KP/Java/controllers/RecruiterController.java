package trueman.KP.Java.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/Recruiter")
public class RecruiterController
{
    @GetMapping("/ApplicationAnalysis")
    public String methodApplicationAnalysis(Model model) throws SQLException, ClassNotFoundException{
        return "Пусто";
    }
    @GetMapping("/ResumeCheck")
    public String methodResumeCheck(Model model) throws SQLException, ClassNotFoundException{
        return "Пусто";
    }
    @GetMapping("/SendingQuestionnairesToSecurityService")
    public String methodSendingQuestionnairesToSecurityService(Model model) throws SQLException, ClassNotFoundException{
        return "Пусто";
    }
    @GetMapping("/FormationProfilesPost")
    public String methodFormationProfilesPost(Model model) throws SQLException, ClassNotFoundException{
        return "Пусто";
    }
    @GetMapping("/ExecutionTreaty")
    public String methodExecutionTreaty(Model model) throws SQLException, ClassNotFoundException{
        return "Пусто";
    }
}
