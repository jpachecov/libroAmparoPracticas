import { Capitulo } from './capitulo';
import { DetalleArchivo } from './DetalleArchivo';
export const CAPITULOS_PRACTICAS: Capitulo[] = [

	{
		id: 0, nombre: 'Introducción', resumen:'', listaArchivos:null,
	},
	{	id: 1, nombre: 'Envío de mensajes al usuario',
		resumen: 'En este capítulo se presenta una práctica para que el alumno tenga un primer contacto con Java, que conozca la estructura de los programas en Java, aprenda a compilar programas, corregir errores y ejecutar programas a la vez que se ejercita en el uso de las instrucciones proporcionadas para mostrar mensajes al usuario en la pantalla de la computadora. ', 
		listaArchivos: [
			{
				nombre:'Etiquetador',
				descripcion:'',
				ruta:'Etiquetador.java',
				tipo:'java'
			},
			{
				nombre:'Felicitación',
				descripcion:'',
				ruta:'Felicitacion.java',
				tipo:'java'
			}
		]
	},
	{	id: 2, nombre: 'Elementos de Java',
		resumen: 'En este capítulo se incluyen prácticas para que el alumno trabaje con variables para almacenar sus datos, siendo éstas para tipos primitivos. Con estas prácticas también se podrá ejercitarse en distinguir las palabras reservadas de las qe no lo son, así como en declarar variables y hacer operaciones con ellas. ', 
		listaArchivos: [
			{
				nombre:'Convertidores',
				descripcion:'',
				ruta:'convertidores.zip',
				tipo:'java'
			},
			{
				nombre:'Fórmulas',
				descripcion:'',
				ruta:'formulas.zip',
				tipo:'java'
			},
			{
				nombre:'Identificadores',
				descripcion:'',
				ruta:'identificadores.zip',
				tipo:'java'
			},
			{
				nombre:'Operadores',
				descripcion:'',
				ruta:'operadores.zip',
				tipo:'java'
			}
		]
	},
	{	id: 3, nombre: 'La clase String',
		resumen: 'En este capítulo se tiene un conjunto de prácticas para que el alumno se familiare con la creación y uso de clases existentes a través del uso de los métodos incluídos en ella. Las prácticas consistenen desarrolar programas sencillos que utilicen objetos de las clase Scanner y String proporcionadas por Java.', 
		listaArchivos: [
			{
				nombre:'Mosca',
				descripcion:'',
				ruta:'mosca.zip',
				tipo:'java'
			},
			{
				nombre:'Psicólogo',
				descripcion:'',
				ruta:'psicologo.zip',
				tipo:'java'
			},
			{
				nombre:'RFC',
				descripcion:'',
				ruta:'rfc.zip',
				tipo:'java'
			},
			{
				nombre:'Telégrafo',
				descripcion:'',
				ruta:'telegrafo.zip',
				tipo:'java'
			}
		]
	},
	{	id: 4, nombre: 'Creación y uso de objetos',
		resumen: 'En este capítulo se presentan prácticas para que el alumno refuerce sus conocimientos acerca de la creación y manipulación de objetos en Java y del uso de la instrucción condicional if. Las prácticas contenidas en este capítulo consisten en desarrollar programas utilizando clases previamente definidas y proporcinadas para este fin. A partir de este capítulo se hará hincapié en la importancia que tiene la documentación de un programa. El alumno deberá docuentar su programa utilizando las etiquetas requeridas por el programa javadoc. ', 
		listaArchivos: [
			{
				nombre:'Edad',
				descripcion:'',
				ruta:'edad.zip',
				tipo:'java'
			},
			{
				nombre:'Hola mundo',
				descripcion:'',
				ruta:'holaMundo.zip',
				tipo:'java'
			},
			{
				nombre:'Juego con dados',
				descripcion:'',
				ruta:'juegoDados.zip',
				tipo:'java'
			},
			{
				nombre:'Múltiplos',
				descripcion:'',
				ruta:'multiplos.zip',
				tipo:'java'
			}
		]
	},
	{	id: 5, nombre: 'Creación y uso de clases',
		resumen: 'Este capítulo contiene un conjunto de prácticas para que el alumno se ejercite en la creación y elaboración de clases que le ayuden a resolver diversos problemas. Algunas de las clases desarrolladas pueden verse como una extensión a los tipos de datos proporcionados por Java. Se hace énfasis en la división del trabajo en métodos, incluyendo dos que son buena práctica de programación: equals y toString. También se insiste en la documentación y pruebas de las clases desarrolladas.', 
		listaArchivos: [
			{
				nombre:'Cuentas',
				descripcion:'',
				ruta:'cuentas.zip',
				tipo:'java'
			},
			{
				nombre:'Racionales',
				descripcion:'',
				ruta:'racionales.zip',
				tipo:'java'
			},
			{
				nombre:'Robot',
				descripcion:'',
				ruta:'robot.zip',
				tipo:'java'
			},
			{
				nombre:'Temperatura',
				descripcion:'',
				ruta:'temperatura.zip',
				tipo:'java'
			}
		]
	},
	{	id: 6, nombre: 'Objetos como atributos',
		resumen: 'En este capítulo se incluyen prácticas para que el alumno consolide sus conocimientos acerca del concepto de agragación, así como su habilidad para constuir clases que involucren el uso de clases existentes, de las cuales no se tien el código fuente, sólo se tiene el código ejecutable y documentación.', 
		listaArchivos: [
			{
				nombre:'Estacionamiento',
				descripcion:'',
				ruta:'estacionamiento.zip',
				tipo:'java'
			},
			{
				nombre:'Etiquetas',
				descripcion:'',
				ruta:'etiquetas.zip',
				tipo:'java'
			},
			{
				nombre:'Rectángulos',
				descripcion:'',
				ruta:'ractangulos.zip',
				tipo:'java'
			},
			{
				nombre:'Triángulos',
				descripcion:'',
				ruta:'triangulos.zip',
				tipo:'java'
			}
		]
	},
	{	id: 7, nombre: 'Arreglos',
		resumen: 'En este capítulo se presentan prácticas para que el alumno se ejercite en el desarrollo de programas que manejan varios datos del mismo tipo, sea este primitivo o clase, agrupados estos en un objeto denominado arreglo y también se ejercite en el uso de instrucción de iteración.', 
		listaArchivos: [
			{
				nombre:'Çartas',
				descripcion:'',
				ruta:'cartas.zip',
				tipo:'java'
			},
			{
				nombre:'Conjuntos',
				descripcion:'',
				ruta:'conjuntos.zip',
				tipo:'java'
			},
			{
				nombre:'Contestadora',
				descripcion:'',
				ruta:'contestadora.zip',
				tipo:'java'
			},
			{
				nombre:'Estadísticas',
				descripcion:'',
				ruta:'estadisticas.zip',
				tipo:'java'
			}
		]
	},
	{	id: 8, nombre: 'Paso de parámetros',
		resumen: 'En este capítulo se tienen prácticas para que el alumno refuerce sus conocimientos acerca del paso de parámetros por valor, la diferencia entre parámetro formal y parámetro real o actual, así como el paso de parámetros al método main. ', 
		listaArchivos: [
			{
				nombre:'Parámetros 1',
				descripcion:'',
				ruta:'parametros1.zip',
				tipo:'java'
			},
			{
				nombre:'Parámetros 2',
				descripcion:'',
				ruta:'parametros2.zip',
				tipo:'java'
			},
			{
				nombre:'Parámetros punto',
				descripcion:'',
				ruta:'paramsPunto.zip',
				tipo:'java'
			},
			{
				nombre:'Parámetros triángulo',
				descripcion:'',
				ruta:'paramsTriangulo.zip',
				tipo:'java'
			}
		]
	},
	// Falta clase Contrato.java para compilar clase Nomina.java, Permanente.java, Horas.java, TiempoCompleto.java
	{	id: 9, nombre: 'Herencia',
		resumen: 'En este capítulo se tienen prácticas que sirven para que el alumno se ejercite en la creación de jerarquías de herencia de clases, ya sea empezando de la raíz o bien especializando clases existentes. Además de que refuerce sus conocimientos acerca del concepto de polimorfismo y de datos protegidos. ', 
		listaArchivos: [
			{
				nombre:'Actas',
				descripcion:'',
				ruta:'actas.zip',
				tipo:'java'
			},
			{
				nombre:'Boletos',
				descripcion:'',
				ruta:'boletos.zip',
				tipo:'java'
			},
			{
				nombre:'Círculos',
				descripcion:'',
				ruta:'circulos.zip',
				tipo:'java'
			},
			{
				nombre:'Libros',
				descripcion:'',
				ruta:'libros.zip',
				tipo:'java'
			}
		]
	},
	{	id: 10, nombre: 'Excepciones',
		resumen: 'En este capítulo se presentan prácticas para que el alumno se ejercite en el manejo de excepciones como un mecanismo para escribir programas robustos. Estas excepciones pueden ser de las proporcionadas por Java o bien desarrolladas para el programa particular que se esté desarrollando. El manejo de las excepciones incluye su lanzamiento, atrapado y recuperación. ', 
		listaArchivos: [
			{
				nombre:'Círculo y arreglo',
				descripcion:'',
				ruta:'circuloYArreglo.zip',
				tipo:'java'
			},
			{
				nombre:'Fechas',
				descripcion:'',
				ruta:'fechas.zip',
				tipo:'java'
			},
			{
				nombre:'Horas',
				descripcion:'',
				ruta:'horas.zip',
				tipo:'java'
			},
			{
				nombre:'Racionales',
				descripcion:'',
				ruta:'racionales.zip',
				tipo:'java'
			}
		]
	},
	{	id: 11, nombre: 'Clases abstractas',
		resumen: 'Este capítulo contiene un conjunto de prácticas para que el alumno adquiera experiencia en la creación de jerarquías de clases que contengan al menos una clase que no puede definirse completamente al momento de su creación y obliga a que sus subclases implementen los métodos que no se pueden definir en ella. Estas clases se conocen como clases abstractas. ', 
		listaArchivos: [
			{
				nombre:'Ajedrez',
				descripcion:'',
				ruta:'ajedrez.zip',
				tipo:'java'
			},
			{
				nombre:'Animales',
				descripcion:'',
				ruta:'animales.zip',
				tipo:'java'
			},
			{
				nombre:'Colecciones',
				descripcion:'',
				ruta:'colecciones.zip',
				tipo:'java'
			},
			{
				nombre:'Figuras',
				descripcion:'',
				ruta:'figuras.zip',
				tipo:'java'
			},
			{
				nombre:'Hormigas',
				descripcion:'',
				ruta:'hormigas.zip',
				tipo:'java'
			},
			{
				nombre:'Polígonos',
				descripcion:'',
				ruta:'poligonos.zip',
				tipo:'java'
			}
		]
	},
	{	id: 12, nombre: 'Interfaces',
		resumen: 'En este capítulo se incluye una serie de prácticas para que el programador ejercite sus conocimientos acerca de la utilidad y programación de interfaces durante el desarrollo de sus programas. Las prácticas incluyen la implementación de interfaces proporcionadas por Java así como de interfaces definidas para la aplicación. ', 
		listaArchivos: [
			{
				nombre:'Comparador',
				descripcion:'',
				ruta:'comparador.zip',
				tipo:'java'
			},
			{
				nombre:'Conjuntos',
				descripcion:'',
				ruta:'conjuntos.zip',
				tipo:'java'
			},
			{
				nombre:'Palabras',
				descripcion:'',
				ruta:'palabras.zip',
				tipo:'java'
			},
			{
				nombre:'Series',
				descripcion:'',
				ruta:'series.zip',
				tipo:'java'
			}
		]
	},
	{	id: 13, nombre: 'Serialización',
		resumen: 'El propósito de las práctias presentadas en este capítulo es que el alumno aprenda los pasos que deben seguirse para lograr que los objetos creados durante la ejecución de un programa persistan más allá de la ejecución del mismo mediante su almacenamiento en archivos en disco. También que conozca el procedimiento para recuperar objetos de archivos. Este proceso se conoce en Java como serializacioón de objetos. ', 
		listaArchivos: [
			{
				nombre:'Diario',
				descripcion:'',
				ruta:'diario.zip',
				tipo:'java'
			},
			{
				nombre:'Eventos',
				descripcion:'',
				ruta:'eventos.zip',
				tipo:'java'
			},
			{
				nombre:'Personas',
				descripcion:'',
				ruta:'personas.zip',
				tipo:'java'
			}
		]

	},

];