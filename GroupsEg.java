package org.example;

import org.testng.annotations.Test;

public class GroupsEg {
    @Test(groups = "regression")
   void Grp1(){
       System.out.println("Group1");
   }

    @Test(groups = "critical")
    void Grp2(){
        System.out.println("Group2");
    }
    @Test(groups = "critical")
    void Grp3(){
        System.out.println("Group3");
    }
    @Test(groups = "regression")
    void Grp4(){
        System.out.println("Group4");
    }
    @Test(groups = {"critical","regression"})
    void Grp5(){
        System.out.println("Group5");
    }
    @Test(groups = "critical")
    void Grp6(){
        System.out.println("Group6");
    }
}
