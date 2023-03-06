package trueman.KP.Java.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/acter")
public class HomeController
{
    @GetMapping("/departmentHead")
    public String getdepartmentHeadPage(Model model) throws SQLException, ClassNotFoundException{
        return "departmentHeadPage";
    }
    @GetMapping("/Applicant")
    public String getApplicantPage(Model model) throws SQLException, ClassNotFoundException{
        return "ApplicantPage";
    }
    @GetMapping("/Recruiter")
    public String getRecruiterPage(Model model) throws SQLException, ClassNotFoundException{
        return "RecruiterPage";
    }
    @GetMapping("/Director")
    public String getDirectorPage(Model model) throws SQLException, ClassNotFoundException{
        return "DirectorPage";
    }
    @GetMapping("/SecurityOfficer")
    public String getSecurityOfficerPage(Model model) throws SQLException, ClassNotFoundException{
        return "SecurityOfficerPage";
    }
    @GetMapping("/Administrator")
    public String getAdministratorPage(Model model) throws SQLException, ClassNotFoundException{
        return "AdministratorPage";
    }
}