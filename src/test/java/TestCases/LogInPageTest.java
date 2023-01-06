package TestCases;

import com.anshu.Base.BasePage;

import Pages.HomePage;
import Pages.HomePageProfile;
import Pages.LogInPage;

public class LogInPageTest extends BasePage
{
public static void main(String []arg) {
	
	
	HomePage home=new HomePage();
	home.SignIn();
	LogInPage log=new LogInPage();
	log.IdEnter();
	HomePageProfile hp= new HomePageProfile();
	hp.Bigin();
	//fjsadkdasjfjsdf
}
}
