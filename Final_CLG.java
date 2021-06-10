package Final_clginstitute_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Final_CLG {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\Selenium Zar\\chromedriver_win32\\chromedriver.exe");
	    WebDriver wd= new ChromeDriver();
	    wd.get("http://www.clginstitute.org/clgengineering/");
	    wd.manage().window().maximize();
	    System.out.println("Tittle is " +wd.getTitle());
	    Thread.sleep(2000);
	    
	    //Home 
	    
	    wd.findElement(By.linkText("Home")).click();
	    System.out.println("Home: ");
	    Thread.sleep(2000);
	    
	    //About Us
      
	    wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	    System.out.println("About Us: ");

	    
	    wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/ul/li[1]/a")).click();
	    Thread.sleep(2000);

	    wd.navigate().back();
	   
	    wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a")).click();
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/ul/li[2]/a")).click();
	    Thread.sleep(2000);

	    wd.navigate().back();

        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a")).click();
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/ul/li[3]/a")).click();
	    Thread.sleep(2000);

	    wd.navigate().back();

	   
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a")).click();
	    wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/ul/li[4]/a")).click();
	    Thread.sleep(2000);

	    wd.navigate().back();

	    
	    wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a")).click();
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/ul/li[5]/a")).click();
	    Thread.sleep(2000);

	    wd.navigate().back();

	 
	    //Academic
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a")).click();
	    System.out.println("Academic: ");
	    Thread.sleep(3000);

        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/ul/li[1]/a")).click();
	    Thread.sleep(3000);

        wd.navigate().back();
       
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a")).click(); 
	    Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/ul/li[2]/a")).click();
	    
        wd.navigate().back();
	    
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a")).click();
	    Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/ul/li[3]/a")).click();
	    
        wd.navigate().back();
       
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a")).click();      
	    Thread.sleep(3000);
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/ul/li[4]/a")).click();
	    
        wd.navigate().back();
        
	    Thread.sleep(2000);

        //Facilities
        
	    wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();
	    Thread.sleep(2000);
	    System.out.println("Facilities: ");
	    wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/ul/li[1]/a")).click();
	    
	    wd.navigate().back();
	    
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();
	    Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/ul/li[2]/a")).click();
        
        wd.navigate().back();
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();
	    Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/ul/li[3]/a")).click();
        
        wd.navigate().back();
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();
	    Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/ul/li[4]/a")).click();
        
        wd.navigate().back();
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();
	    Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/ul/li[5]/a")).click();
        
        wd.navigate().back();
	    

        //Gallary
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[5]/a")).click();
	    System.out.println("Gallary: ");
	    
	    wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/ul/li[1]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();
        
        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/ul/li[2]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();

        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/ul/li[3]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();

        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/ul/li[4]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();

        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/ul/li[5]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();

        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/ul/li[6]/a/img")).click();
        Thread.sleep(2000);     
        wd.navigate().back();

        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/ul/li[7]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();

        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/ul/li[8]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();
        
        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/ul/li[9]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();

        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/ul/li[10]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();

        //Contact Us
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[6]/a")).click();
	    System.out.println("Contact Us: "); 
	    
	    //OurCourses & Downloads
	    wd.findElement(By.linkText("Home")).click();

	    JavascriptExecutor js1 = (JavascriptExecutor) wd;
        js1.executeScript("window.scrollTo(0,1000)");
        Thread.sleep(2000);
        
        //Home----->OurCourses
        
        wd.findElement(By.xpath("//*[@id=\"coursedetail\"]/div[4]/div[2]/ul/li[1]/a")).click();
        wd.navigate().back();
	    Thread.sleep(2000);
        
        wd.findElement(By.xpath("//*[@id=\"coursedetail\"]/div[4]/div[2]/ul/li[2]/a")).click();
        wd.navigate().back();
	    Thread.sleep(2000);

        wd.findElement(By.xpath("//*[@id=\"coursedetail\"]/div[4]/div[2]/ul/li[3]/a")).click();
        wd.navigate().back();
	    Thread.sleep(2000);

        wd.findElement(By.xpath("//*[@id=\"coursedetail\"]/div[4]/div[2]/ul/li[4]/a")).click();
        wd.navigate().back();
	    Thread.sleep(2000);

        //Home----->Downloads
	    	

        wd.findElement(By.xpath("//*[@id=\"coursedetail\"]/div[2]/ul/li[1]/a")).click();
        wd.navigate().back();
        Thread.sleep(6000);
        
        wd.findElement(By.linkText("Home")).click();
	    
	    JavascriptExecutor js2 = (JavascriptExecutor) wd;
        js2.executeScript("window.scrollTo(0,1000)");	
       
        
        wd.findElement(By.xpath("//*[@id=\"coursedetail\"]/div[2]/ul/li[2]/a")).click();
        wd.navigate().back();
	    Thread.sleep(2000);

        wd.findElement(By.xpath("//*[@id=\"coursedetail\"]/div[2]/ul/li[3]/a")).click();
        wd.navigate().back();
	    Thread.sleep(2000);

        wd.findElement(By.xpath("//*[@id=\"coursedetail\"]/div[2]/ul/li[4]/a")).click();
        wd.navigate().back();
	    Thread.sleep(2000);

        wd.findElement(By.xpath("//*[@id=\"coursedetail\"]/div[2]/ul/li[5]/a")).click();
        wd.navigate().back();
	    Thread.sleep(2000); 

        
	    //Admission open for Session (2020-2021)
	    	    
	    wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/marquee/a")).click();	

	   ///Admission---->Facebook
	    wd.findElement(By.xpath("//*[@id=\"social-sidebar\"]/li[1]/a")).click();
	    wd.navigate().back();
	    
	    //Admission-------->Instagram
	    wd.findElement(By.xpath("//*[@id=\"social-sidebar\"]/li[2]/a")).click();
	    wd.navigate().back();
	    
	    //Admission-------->Youtube
	    wd.findElement(By.xpath("//*[@id=\"social-sidebar\"]/li[3]/a")).click();
	    wd.navigate().back();
	    
        //Admission-------->Whatsapp
	    wd.findElement(By.xpath("//*[@id=\"social-sidebar\"]/li[4]/a")).click();
	    wd.navigate().back(); 
	    
        //Admission------->Home 
	    
	    wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	    wd.findElement(By.xpath("//*[@id=\"onload\"]/div/div/div[1]/button")).click();
		JavascriptExecutor js3 = (JavascriptExecutor) wd;
        js3.executeScript("window.scrollTo(0,500)");
        Thread.sleep(2000);
        
        //Admission------->Home----->CLG Institue

        wd.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a/img")).click();
	    System.out.println("CLG Institute : ");

        Thread.sleep(2000);
	   
        //Admission------->Home----->CLG Institue----->Home---->Ajey
        
        JavascriptExecutor js4 = (JavascriptExecutor) wd;

        js4.executeScript("window.scrollTo(0,500)");
	    Thread.sleep(2000);
	    wd.findElement(By.xpath("//*[@id=\"coursedetail\"]/div[2]/ul/li[1]/a")).click(); 
	    Thread.sleep(2000);

	    wd.navigate().back();
	   
	    JavascriptExecutor js5 = (JavascriptExecutor) wd;

        js5.executeScript("window.scrollTo(0,1000)");
	    Thread.sleep(2000);
	    wd.findElement(By.xpath("//*[@id=\"coursedetail\"]/div[2]/ul/li[2]/a")).click();
	    wd.navigate().back();
	    
	    JavascriptExecutor js6 = (JavascriptExecutor) wd;

        js6.executeScript("window.scrollTo(0,1000)");
	    Thread.sleep(2000);
	    wd.findElement(By.xpath("//*[@id=\"coursedetail\"]/div[2]/ul/li[3]/a")).click();
	    wd.navigate().back();
	   
	    JavascriptExecutor js7 = (JavascriptExecutor) wd;

        js7.executeScript("window.scrollTo(0,1000)");
	    Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"coursedetail\"]/div[2]/ul/li[4]/a")).click();
	    wd.navigate().back();
	    
        
        //Admission------->Home----->CLG Institue----->Home---->Course
 	   
        Thread.sleep(2000);
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a")).click();
        
        //Admission------->Home----->CLG Institue----->Home---->Facilities
	    
        Thread.sleep(2000);

        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();
        
        //Admission------->Home----->CLG Institue----->Home---->Download
	  
        Thread.sleep(2000);

        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[5]/a")).click();
        
       
        //Admission------->Home----->CLG Institue----->Home---->Avsar
	    Thread.sleep(2000);

        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[6]/a")).click();
        
        //Admission------->Home----->CLG Institue----->Home---->Contact
	    Thread.sleep(2000);

        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[7]/a")).click();     

	    
       //To get back on Home picture page of CLG institute
        
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[1]/div[1]/a/img")).click();
        Thread.sleep(2000);
        
        //To close Advertise
        wd.findElement(By.xpath("//*[@id=\"onload\"]/div/div/div[1]/button")).click();
        Thread.sleep(2000);
        JavascriptExecutor js11 = (JavascriptExecutor) wd;

        js11.executeScript("window.scrollTo(0,500)"); 
       
        //To open CLG Sr. school
        
        wd.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/a/img")).click();
	    System.out.println("CLG Sr. School: ");

        Thread.sleep(2000);

        //CLG Sr. School> Home
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        
        //CLG Sr. School> About US with 5 categories

        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/ul/li[1]/a")).click();     
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/ul/li[2]/a")).click();
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/ul/li[3]/a")).click();
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/ul/li[4]/a")).click();
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/ul/li[5]/a")).click();

        //CLG Sr. School> Academics with 4 categories

        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a")).click();
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/ul/li[1]/a")).click();
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a")).click();
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/ul/li[2]/a")).click();
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a")).click();
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/ul/li[3]/a")).click();
       
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/a")).click();
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[3]/ul/li[4]/a")).click();
        
        //CLG Sr. School> Admission with 3 categories
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();   
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/ul/li[1]/a")).click();
        wd.navigate().back();
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();   
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/ul/li[2]/a")).click();
        wd.navigate().back();
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/ul/li[3]/a")).click();
        wd.navigate().back();
        
        //CLG Sr. School> Gallary with 7 images
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[5]/a")).click();
        
        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[1]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();
        
        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();
        
        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[3]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();
        
        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[4]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();
        
        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[5]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();
        
        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[6]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();
        
        wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[7]/a/img")).click();
        Thread.sleep(2000);
        wd.navigate().back();
        
       //CLG Sr. School> Activities
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[6]/a")).click();
        
        //CLG Sr. School> Contact Us
        
        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[7]/a")).click();   //execution done

     
        //To get back on Home picture page of CLG institute
        
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[1]/div[1]/a/img")).click();
        Thread.sleep(2000);
        
        //To close Advertise
        wd.findElement(By.xpath("//*[@id=\"onload\"]/div/div/div[1]/button")).click(); 
        
        JavascriptExecutor js12 = (JavascriptExecutor) wd;

        js12.executeScript("window.scrollTo(0,500)");
        
        //To open CLG Engineering clg   
        
        wd.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/a/img")).click();   
	    System.out.println("CLG Engineering clg: ");
        
	    wd.navigate().back();
        
	    Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"onload\"]/div/div/div[1]/button")).click(); 

        JavascriptExecutor js13 = (JavascriptExecutor) wd;

        js13.executeScript("window.scrollTo(0,500)");
        
        //To open CLG Pharmacy clg
        
        wd.findElement(By.xpath("/html/body/div[4]/div[2]/div[4]/a/img")).click(); 
	    System.out.println("CLG Pharmacy clg: ");

        wd.navigate().back();
       
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"onload\"]/div/div/div[1]/button")).click(); 
        
        JavascriptExecutor js14 = (JavascriptExecutor) wd;

        js14.executeScript("window.scrollTo(0,500)");
        
        
        //To open CLG Degree clg
        
        wd.findElement(By.xpath("/html/body/div[4]/div[2]/div[5]/a/img")).click();     
	    System.out.println("CLG Degree clg: ");

        wd.navigate().back();
	    
        Thread.sleep(2000);

        wd.findElement(By.xpath("//*[@id=\"onload\"]/div/div/div[1]/button")).click();
        
        JavascriptExecutor js15 = (JavascriptExecutor) wd;

        js15.executeScript("window.scrollTo(0,500)");
        
        //To open CLG PVT ITI
        
        wd.findElement(By.xpath("/html/body/div[4]/div[2]/div[6]/a/img")).click();     
	    System.out.println("CLG PVT ITI: ");   

        wd.navigate().back();
        
	    Thread.sleep(2000);

        wd.findElement(By.xpath("//*[@id=\"onload\"]/div/div/div[1]/button")).click();   //Execution done
        
        wd.close();
        
      /* //stop here
        JavascriptExecutor js16= (JavascriptExecutor) wd;

        js16.executeScript("window.scrollBy(0,-1000)");   	
        
	    //Admission------>Profile
       

        wd.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[2]/a")).click();
        wd.navigate().back();
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"onload\"]/div/div/div[1]/button")).click();

       	    

	    //Admission------>About Us
	    
	    wd.findElement(By.xpath("/html/body/div[2]/div/div/div/nav/div/div[2]/ul/li[3]/a")).click();
	    wd.navigate().back();
        wd.findElement(By.xpath("//*[@id=\"onload\"]/div/div/div[1]/button")).click();

	    
	    //Admission------->Why CLG
	    
	    wd.findElement(By.xpath("/html/body/div[2]/div/div/div/nav/div/div[2]/ul/li[4]/a")).click();
	    wd.navigate().back();
        wd.findElement(By.xpath("//*[@id=\"onload\"]/div/div/div[1]/button")).click();

	    
	    //Admission------->Skill And Training
       
	    wd.findElement(By.xpath("/html/body/div[2]/div/div/div/nav/div/div[2]/ul/li[5]/a")).click();
	    
	    
	    Set <String> windows= wd.getWindowHandles();
	    Iterator <String> it= windows.iterator();
	    String parent_window= it.next();
	    String child_window= it.next();

	    wd.switchTo().window(parent_window);
	    wd.switchTo().window(child_window);
	    wd.close();
	    
	    wd.switchTo().window(parent_window);
	    
	    //Admission------->Grievance
	    
	    wd.findElement(By.xpath("/html/body/div[2]/div/div/div/nav/div/div[2]/ul/li[6]/a")).click();
	   
	    wd.switchTo().window(parent_window);


	    //Admission------->Gallery
	    
	    wd.findElement(By.xpath("/html/body/div[2]/div/div/div/nav/div/div[2]/ul/li[7]/a")).click();
	    wd.navigate().back();
        wd.findElement(By.xpath("//*[@id=\"onload\"]/div/div/div[1]/button")).click();

	    
	    //Admission------->Download
	    
	    wd.findElement(By.xpath("/html/body/div[2]/div/div/div/nav/div/div[2]/ul/li[8]/a")).click();
	    wd.navigate().back();
        wd.findElement(By.xpath("//*[@id=\"onload\"]/div/div/div[1]/button")).click();

	    
	    //Admission-------->Download------->Brochure
	    
	    wd.findElement(By.xpath("/html/body/div[2]/div/div/div/nav/div/div[2]/ul/li[8]/ul/li/a")).click();
	    wd.navigate().back();
	    
	    //Admission------->Careers

	    wd.findElement(By.xpath("/html/body/div[2]/div/div/div/nav/div/div[2]/ul/li[9]/a")).click();
	    
	    //Admission------->Contact Us
	    
	    wd.findElement(By.xpath("/html/body/div[2]/div/div/div/nav/div/div[2]/ul/li[10]/a")).click(); */
	    

	    
       
        

	}

}
