# SOLUTION LAB-INHERITANCE
## Parte I - Entendiendo las Interfaces `Shape`
### Respuesta
* ¿Cuál es la relación entre `Circle` y `Shape`?
  
    La relación entre Circle y Shape es de herencia, Circle hereda de Shape.
* ¿Cuál es la relación entre `Cylinder` y `Shape`?

    La relación entre Cylinder y Shape es de herencia, Cylinder hereda de Circle y este hereda de Shape.
* ¿Cuál es la relación entre `Circle` y `GeometricShape2D`?
  
    La relación entre Circle y GeometricShape2D es: Circle es un GeometricShape2D.
* ¿Cuál es la relación entre `Cylinder` y `GeometricShape3D`?

  La relación entre Cylinder y GeometricShape3D es: Cylinder es un GeometricShape3D.
## Parte II - Implementando herencia
### Evidencia Diseño

![](img/shaper-class-diagram.png)

### Clase `Triangle` evidencia test
![](img/test-passed-triangle-class.PNG)

### Clase `Rectangle` evidencia test
![](img/test-passed-rectangle-class.PNG)
 
### Clase `Square` evidencia test
![](img/test-passed-square-class.PNG) 

## Parte III - Diseñando Herencia
### Diseño
![](img/shapes-class-2-diagram.png)

## Parte IV - Herencia en un contexto
### Diseños
### `Diagrama de Clases`
![](img/sabanapayroll-class-diagram.png)

### `Diseño printPayroll`
![](img/printpayroll-class-diagram.png)

### `Diseño calculateEmployeeSalary`
![](img/calculateemployeesalary-class-diagram.png)

### `Diseño calculateDepartmentSalaries`
![](img/calculatedepartmentsalaries-class-diagram.png)

### `Diseño calculateUniversitySalaries`
![](img/calculateuniversitysalaries-class-diagram.png)

### Evidencias
### `Evidencia Test`
![](img/test-passed-sabanapayroll-system.PNG)

### `Imprimir la lista de empleados`
![](img/print-employee-sabanapayroll-system.PNG)