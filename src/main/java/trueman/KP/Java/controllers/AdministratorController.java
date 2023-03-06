package trueman.KP.Java.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/Administrator")
public class AdministratorController
{
    @GetMapping("/CreationAdvertising")
    public String methodCreationAdvertising(Model model) throws SQLException, ClassNotFoundException{
        return "Пусто";
    }
    @GetMapping("/AddingInformationToSite")
    public String methodAddingInformationToSite(Model model) throws SQLException, ClassNotFoundException{
        return "Пусто";
    }
}