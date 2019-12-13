package tests.day7;

import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationsTest {

    @BeforeClass
    public void beforeClass(){

     }
     @AfterClass
     public void afterClass(){

     }

    @BeforeMethod
    public void setup(){
        System.out.println("Before method");
    }

    @AfterMethod
    public void teardown(){
        System.out.println("After Method");
    }

    @Test
    public void test1(){
        System.out.println("Test1");
        Assert.assertTrue(5==5);
    }

    @Test
    public void test2(){

    }

    @Test
    public void test3(){

    }
}
