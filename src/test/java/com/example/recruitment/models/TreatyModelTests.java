package com.example.recruitment.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreatyModelTests {
    private Treaty treatys;

    @BeforeEach
    public void createEmptyTreaty() {
        treatys = new Treaty();
    }

    @Test
    public void EmptyTreatyCanBeCreated(){

        // Act && Assert
        assertDoesNotThrow(() -> new New());
    }

    @Test
    public void NewWithValuesCanBeCreated(){

        var id = 1;
        var name_post = "������������";
        var fio = "���";
        var StatusTreaty = "���";
        var Wage = 1000;
        var date_of_conclusion = "2002-10-10";

        // Act && Assert
        assertDoesNotThrow(() -> new Treaty(id,name_post,fio,StatusTreaty,Wage,date_of_conclusion));
    }

    @Test
    public void ReviewModelCanNotBeCreatedWithIllegalTitleArgument(){

        var id = 1;
        var name_post = " ";
        var fio = "���";
        var StatusTreaty = "���";
        var Wage = 1000;
        var date_of_conclusion = "2002-10-10";

        // Act && Assert
        assertThrows(IllegalArgumentException.class, () -> new Treaty(id,name_post,fio,StatusTreaty,Wage,date_of_conclusion));
    }

    @Test
    public void ReviewModelCanNotBeCreatedWithIllegalTextArgument(){

        var id = 1;
        var name_post = " ";
        var fio = " ";
        var StatusTreaty = "���";
        var Wage = 1000;
        var date_of_conclusion = "2002-10-10";

        // Act && Assert
        assertThrows(IllegalArgumentException.class, () -> new Treaty(id,name_post,fio,StatusTreaty,Wage,date_of_conclusion));
    }


    @Test
    public void NewCanEditCorrectTitleAndText(){

        // Arrange
        var name_post = "������������";
        var fio = "��������";

        // Act && Assert
        var treatys = new Treaty();

        assertDoesNotThrow(() -> treatys.setName_post(name_post));
        assertDoesNotThrow(() -> treatys.setFio(fio));

        assertEquals(name_post, treatys.getName_post());
        assertEquals(fio, treatys.getFio());
    }

    @Test
    public void NewCanNotEditIllegalTitleAndTextArguments(){

        // Arrange

        var id = 1;
        var name_post = " ";
        var fio = " ";
        var StatusTreaty = "���";
        var Wage = 1000;
        var date_of_conclusion = "2002-10-10";


        assertThrows(IllegalArgumentException.class, () -> new Treaty(id,name_post,fio,StatusTreaty,Wage,date_of_conclusion));
    }
}
