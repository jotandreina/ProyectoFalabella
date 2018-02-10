Feature: Visitar Falabella


Scenario:  En google.cl buscar la palabra falabella y del listado que aparece, presionar en el texto que dice Falabella.com - Mejor Compra Online
Given      abrir la pagina principal de google.cl
Then       ingreso la palabra falabella
And        hacer click en buscar
Then       se debe visualizar el texto Falabella.com - Mejor Compra Online
And        acceder al link


Scenario: En Falabella.com, buscar xbox, luego presionar en el producto para ver la nueva pagina con el detalle, finalmente agregarlo a la Bolsa de productos

Given      que cargo la pagina falabella.com
Then       cierro el mensaje emergente de suscripcion
And        escribo xbox
And        lo busco
And        hacer click en el producto
And        agregarlo a la Bolsa
Then       el xbox debe visualizarse en la Bolsa de productos

Scenario: Ir a la Bolsa de compras, aumentar a dos productos para comprar, agregar Garantia Extendida de 2 anos y luego presionar el boton Ir a Comprar

Given     que el xbox se agrego a la Bolsa de compras
Then      ir a la bolsa de compras
And       aumentar a dos productos
And       agregar Garantia Extendida de dos anos
And       hacer click a Ir a Comprar
Then      debe carga la pantalla de compra

Scenario: Completar los datos para generar un tipo de despacho Retira tu compra y luego presionar el botón Continuar para avanzar a la pantalla de pago

Given     que el producto fue cargado
Then      completar los datos de Retira tu compra
And       hacer click en Continuar
And       seleccionar tipo de despacho Retira tu compra
And       seleccionar sucursal
And       hacer click en Continuar para ir al pago
Then      debe cargar la pantalla de pago

Scenario: Seleccione modo de pago Mas opciones de pago, seleccionar Efectivo, completar los datos y presionar el boton Reservar compra

Given     que la pantalla de de pago fue cargada
Then      seleccionar Mas opciones de pago
And       seleccionar Efectivo
And       completar los datos
And       hacer click Reservar compra
Then      la compra debe ser reservada