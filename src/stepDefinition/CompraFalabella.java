package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CompraFalabella {
	
	WebDriver driver;
	
	@Given("^abrir la pagina principal de google.cl$")
	public void abrir_la_pagina_principal_de_google_cl() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andreina Jota\\workspace\\PruebaAutomatizacionAndreinaJota\\Selenium\\Chrome Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.cl");
	}

	@Then("^ingreso la palabra falabella$")
	public void ingreso_la_palabra_falabella() throws Throwable {
		
		driver.findElement(By.id("lst-ib")).sendKeys("falabella");
	    
	}

	@Then("^hacer click en buscar$")
	public void hacer_click_en_buscar() throws Throwable {
		
		Thread.sleep(10000);
		driver.findElement(By.className("lsb")).click();   
	}

	@Then("^se debe visualizar el texto Falabella.com - Mejor Compra Online$")
	public void se_debe_visualizar_el_texto_Falabella_com_Mejor_Compra_Online() throws Throwable {
	   
	}

	@Then("^acceder al link$")
	public void acceder_al_link() throws Throwable {
		
		driver.findElement(By.linkText("Falabella.com - Mejor Compra Online")).click();
	   
	}
	
	@Given("^que cargo la pagina falabella.com$")
	public void que_cargo_la_pagina_falabella_com() throws Throwable {
	    
	}
	
	@Then("^cierro el mensaje emergente de suscripcion$")
	public void cierro_el_mensaje_emergente_de_suscripcion() throws Throwable {
		
		 Thread.sleep(30000);
	   driver.findElement(By.id("acc-alert-deny")).click();
		
	}

	@Then("^escribo xbox$")
	public void escribo_xbox() throws Throwable {
		
		driver.findElement(By.id("searchQuestion")).sendKeys("xbox");
		
		
	    
	}
	@Then("^lo busco$")
	public void lo_busco() throws Throwable {
		
		driver.findElement(By.cssSelector("icon-search fb-masthead__util-bar__icon")).click();
	   
	}

	@Then("^hacer click en el producto$")
	public void hacer_click_en_el_producto() throws Throwable {
		
		driver.findElement(By.className("fb-pod__media")).click();
	}

	@Then("^agregarlo a la Bolsa$")
	public void agregarlo_a_la_Bolsa() throws Throwable {
		
		driver.findElement(By.className("fb-btn fb-btn-primary fb-product-cta__controls--actions--choose")).click();
	   
	}

	@Then("^el xbox debe visualizarse en la Bolsa de productos$")
	public void el_xbox_debe_visualizarse_en_la_Bolsa_de_productos() throws Throwable {
	   
	}

	@Given("^que el xbox se agrego a la Bolsa de compras$")
	public void que_el_xbox_se_agrego_a_la_Bolsa_de_compras() throws Throwable {
	   
	}
	
	@Then("^ir a la bolsa de compras$")
public void ir_a_la_bolsa_de_compras() throws Throwable {
		
		driver.findElement(By.className("fb-btn fb-btn-primary fb-added-to-basket__cta fb-added-to-basket__cta--basket")).click();
	}

	@Then("^aumentar a dos productos$")
public void aumentar_a_dos_productos() throws Throwable {
		
		driver.findElement(By.className("fb-quantity-input__plus")).click();
	   
	}

	@Then("^agregar Garantia Extendida de dos anos$")
public void agregar_Garantia_Extendida_de_dos_anos() throws Throwable {
		
		driver.findElement(By.className("fb-inline-dropdown__link js-inline-dropdown__link")).click();
		driver.findElement(By.linkText("GAR CONSOLA  2A 300-400M (+ $ 59.590)")).click();
	   
	}

	@Then("^hacer click a Ir a Comprar$")
	public void hacer_click_a_Ir_a_Comprar() throws Throwable {
		
		driver.findElement(By.className("fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase")).click();
	    
	}

	@Then("^debe carga la pantalla de compra$")
	public void debe_carga_la_pantalla_de_compra() throws Throwable {
	    
	}

	@Given("^que el producto fue cargado$")
	public void que_el_producto_fue_cargado() throws Throwable {
	    
	}

	@Then("^completar los datos de Retira tu compra$")
	public void completar_los_datos_de_Retira_tu_compra() throws Throwable {
		
		driver.findElement(By.id("emailAddress")).sendKeys("andreina.jota@ahoo.com");
		driver.findElement(By.className("fbra_button fbra_test_button fbra_emailInputForm__submitButton fbra_test_emailInputForm__submitButton")).click();
		driver.findElement(By.id("region")).click();
		new Select(driver.findElement(By.id("region"))).selectByVisibleText("REGION METROPOLITANA");
		driver.findElement(By.id("comuna")).click();
		new Select(driver.findElement(By.id("comuna"))).selectByVisibleText("SANTIAGO CENTRO");
	    
	}

	@Then("^hacer click en Continuar$")
	public void hacer_click_en_Continuar() throws Throwable {
	   
		driver.findElement(By.className("fbra_button fbra_test_button fbra_formItem__field04")).click();
		
	}
	
	@Then("^seleccionar tipo de despacho Retira tu compra$")
	public void seleccionar_tipo_de_despacho_Retira_tu_compra() throws Throwable {
		
		driver.findElement(By.className("fbra_heading fbra_deliveryGroupTab__heading fbra_test_deliveryGroupTab__heading")).click();
	   
	}

	@Then("^seleccionar sucursal$")
	public void seleccionar_sucursal() throws Throwable {
	   
		driver.findElement(By.className("fbra_button fbra_test_button fbra_locationResultsListItem__selectButton fbra_formItem__selectButton")).click();
	}
	
	@Then("^hacer click en Continuar para ir al pago$")
	public void hacer_click_en_Continuar_para_ir_al_pago() throws Throwable {
	   
		driver.findElement(By.className("fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton")).click();	
	}
	
	@Then("^debe cargar la pantalla de pago$")
	public void debe_cargar_la_pantalla_de_pago() throws Throwable {
	 
	}

	@Given("^que la pantalla de de pago fue cargada$")
	public void que_la_pantalla_de_de_pago_fue_cargada() throws Throwable {
	   
	}

	@Then("^seleccionar Mas opciones de pago$")
	public void seleccionar_Mas_opciones_de_pago() throws Throwable {
		
		driver.findElement(By.className("fbra_paymentOptionsTab__text")).click();
	    
	}

	@Then("^seleccionar Efectivo$")
	public void seleccionar_Efectivo() throws Throwable {
		
		driver.findElement(By.className("fbra_button fbra_test_button fbra_formItem__selectPaymentButton")).click();
	}

	@Then("^completar los datos$")
	public void completar_los_datos() throws Throwable {
		
		driver.findElement(By.id("firstName")).sendKeys("Andreina");
		driver.findElement(By.id("lastName")).sendKeys("freitez");
		driver.findElement(By.id("phoneNumber")).sendKeys("87654321"); 
		driver.findElement(By.id("userIdNumber")).sendKeys("111111111");
		driver.findElement(By.className("fbra_text fbra_termsAndConditions__messageText fbra_test_termsAndConditions__messageText")).click();
	}

	@Then("^hacer click Reservar compra$")
	public void hacer_click_Reservar_compra() throws Throwable {
		
		driver.findElement(By.className("fbra_button fbra_test_button fbra_continueButton__button fbra_test_continueButton__button")).click();
	  
	}

	@Then("^la compra debe ser reservada$")
	public void la_compra_debe_ser_reservada() throws Throwable {
	  
	}
}
