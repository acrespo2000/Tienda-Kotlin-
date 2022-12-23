//***********************************************************************************************
//***********************************************************************************************
// CLASE Tienda                                                                          ********
// (Contiene una colección de cada uno de los tipos de productos a la venta)             ********
// (AGREGA TU CÓDIGO SOLO EN LOS LUGARES SEÑALADOS, SIN MODIFICAR EL RESTO DEL CÓDIGO)   ********  
//***********************************************************************************************
//***********************************************************************************************
import kotlin.random.Random
import kotlin.UInt
import kotlin.UByte

class Tienda (var catalogoRopa : List<Ropa>, var catalogoCalzado: List<Calzado>) {

	public fun mostrarColeccionDeRopa(coleccion: List<Ropa>) {
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/ 
         coleccion.forEach{
         	println(" ${it.QR}, ${it.categoria}, ${it.descripcion}, ${it.stock} uds, ${it.precio}€, ${it.descatalogado}, ${it.seccion}, ${it.talla}")
         }                                                                       
    } 
    
    public fun mostrarColeccionDeCalzado(coleccion: List<Calzado>) {
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/ 
         coleccion.forEach{
         	println(" ${it.QR}, ${it.categoria}, ${it.descripcion}, ${it.stock} uds, ${it.precio}€, ${it.descatalogado}, ${it.seccion}, ${it.talla}")
         }                                                                       
    } 
	
	public fun mostrarCatalogoDeRopaCompleto() {
        println("")
        println("SE HA SELECCIONADO MOSTRAR CATÁLOGO COMPLETO DE ROPA...")
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/
        mostrarColeccionDeRopa(catalogoRopa)
        /*catalogoRopa.forEach{
            println(" ${it.QR}, ${it.categoria}, ${it.descripcion}, ${it.stock} uds, ${it.precio}€, ${it.descatalogado}, ${it.seccion}, ${it.talla}")
        }*/
    }
    
    public fun mostrarCatalogoDeCalzadoCompleto() {
        println("")
        println("SE HA SELECCIONADO MOSTRAR CATÁLOGO COMPLETO DE Calzado...")
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/
        mostrarColeccionDeCalzado(catalogoCalzado)
    }
	
	public fun buscarPorId (id: UInt = 0U) {
        println("")
        println("BUSCANDO ARTÍCULOS CON ID = $id")
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/
        var ropaId= catalogoRopa.filter{it.QR==id}
        var calzadoId=catalogoCalzado.filter{it.QR==id}
        
        if(ropaId.size==0){
            if(calzadoId.size==0){
                println("No hay ningún articulo con este id")
            }else{
                 mostrarColeccionDeCalzado(calzadoId)
            }
        }else{
            mostrarColeccionDeRopa(ropaId)
            /*ropaId.forEach{
                println(" ${it.QR}, ${it.categoria}, ${it.descripcion}, ${it.stock} uds, ${it.precio}€, ${it.descatalogado}, ${it.seccion}, ${it.talla}")
            }*/
        }
    }
    
	public fun buscarPorCategoria (categoria: Categoria = Categoria.SC) {
        println("")
        println("BUSCANDO ARTÍCULOS CON CATEGORÍA = $categoria")
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/
        var ropaCategoria= catalogoRopa.filter{it.categoria==categoria}
        var calzadoCategoria =catalogoCalzado.filter{it.categoria==categoria}
        if(ropaCategoria.size==0){
            if(calzadoCategoria.size==0){
                 println("No hay ningún articulo con esta categoria")
            }else{
                 mostrarColeccionDeCalzado(calzadoCategoria)
            }
        }else{
            mostrarColeccionDeRopa(ropaCategoria)
            /*ropaCategoria.forEach{
                println(" ${it.QR}, ${it.categoria}, ${it.descripcion}, ${it.stock} uds, ${it.precio}€, ${it.descatalogado}, ${it.seccion}, ${it.talla}")
            }*/
        }
    }
    
    public fun buscarPorStockMenorA (stock: UByte = 255U) {
        println("")
        println("BUSCANDO ARTÍCULOS CON STOCK INFERIOR A = $stock")
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/
        var ropaStock= catalogoRopa.filter{it.stock<stock}
        var calzadoStock =catalogoCalzado.filter{it.stock<stock}
        if(ropaStock.size==0){
            if(calzadoStock.size==0){
                 println("Esta prenda tiene un stock mayor")
            }else{
                 mostrarColeccionDeCalzado(calzadoStock)
            }
            
        }else{
            mostrarColeccionDeRopa(ropaStock)
           /*ropaStock.forEach{
                println(" ${it.QR}, ${it.categoria}, ${it.descripcion}, ${it.stock} uds, ${it.precio}€, ${it.descatalogado}, ${it.seccion}, ${it.talla}")
            }*/
        }
    }
    
    public fun buscarPorPrecioMaximo (precio: Double = 1000000.0) {
        println("")
        println("BUSCANDO ARTÍCULOS CON PRECIO MÁXIMO = $precio")
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/
        var ropaPrecio: List<Ropa> = catalogoRopa.filter{it.precio<=precio}
        var calzadoPrecio =catalogoCalzado.filter{it.precio<=precio}
        if(ropaPrecio.size==0){
            if(calzadoPrecio.size==0){
                 println("No hay ningún articulo mas barato de $precio")
            }else{
                 mostrarColeccionDeCalzado(calzadoPrecio)
            }
        }else{
            mostrarColeccionDeRopa(ropaPrecio)
            /*ropaPrecio.forEach{
                println(" ${it.QR}, ${it.categoria}, ${it.descripcion}, ${it.stock} uds, ${it.precio}€, ${it.descatalogado}, ${it.seccion}, ${it.talla}")
            }*/
        }
    }
    
    public fun buscarProductosDescatalogados (descatalogado: Boolean = true) {
        println("")
        println("BUSCANDO ARTÍCULOS DESCATALOGADOS = $descatalogado")
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/
        var ropaDescatalogada = catalogoRopa.filter{it.descatalogado==descatalogado}
        var calzadoDescatalogado = catalogoCalzado.filter{it.descatalogado==descatalogado}
        if(ropaDescatalogada.size==0){
             if(calzadoDescatalogado.size==0){
                println("No hay ningun producto descatalogado")
            }else{
                 mostrarColeccionDeCalzado(calzadoDescatalogado)
            }
        }else{
            mostrarColeccionDeRopa(ropaDescatalogada)
            /*ropaDescatalogada.forEach{
                println(" ${it.QR}, ${it.categoria}, ${it.descripcion}, ${it.stock} uds, ${it.precio}€, ${it.descatalogado}, ${it.seccion}, ${it.talla}")
            }*/
        }
        
    }
    
    public fun buscarProductosPorTalla (talla: TallasRopa, talla2: Double = 1000000.0 ) { 
        println("")
        println("BUSCANDO ARTÍCULOS DE LA TALLA = $talla")
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/
        var ropaTalla = catalogoRopa.filter{it.talla==talla}
        var calzadoTalla = catalogoCalzado.filter{it.talla==talla2}
        if(ropaTalla.size==0){
            if(calzadoTalla.size==0){
                println("No queda ropa de esta talla")
            }else{
                 mostrarColeccionDeCalzado(calzadoTalla)
            }
        }else{
            mostrarColeccionDeRopa(ropaTalla)
            /*ropaTalla.forEach{
                println(" ${it.QR}, ${it.categoria}, ${it.descripcion}, ${it.stock} uds, ${it.precio}€, ${it.descatalogado}, ${it.seccion}, ${it.talla}")
            }*/
        }
    }
    
    public fun buscarProductosPorSeccion (seccion: Secciones) {
        println("")
        println("BUSCANDO ARTÍCULOS DE LA SECCION = $seccion")
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/
        var ropaSeccion = catalogoRopa.filter{it.seccion==seccion}
        var calzadoSeccion = catalogoCalzado.filter{it.seccion==seccion}
        if(ropaSeccion.size==0){
            if(calzadoSeccion.size==0){
                println("No queda ropa de esta seccion")
            }else{
                 mostrarColeccionDeCalzado(calzadoSeccion)
            }
        }else{
            mostrarColeccionDeRopa(ropaSeccion)
            /*ropaSeccion.forEach{
                println(" ${it.QR}, ${it.categoria}, ${it.descripcion}, ${it.stock} uds, ${it.precio}€, ${it.descatalogado}, ${it.seccion}, ${it.talla}")
            }*/
        }
    }
	
	// La función buscarProductos() utiliza un filtro múltiple para localizar productos.
	public fun buscarProductos (categoria: Categoria = Categoria.ROPA,
                       			stock: UByte = 255U,
                       			precio: Double = 1000000.0,											
                       			descatalogado: Boolean = false,
                       			seccion: Secciones,
                       			talla: TallasRopa,
                                talla2: Double = 1000000.0 ) {
        println("")
        println("BUSCANDO ARTÍCULOS CON MÚLTIPLES CRITERIOS DE BÚSQUEDA...")
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/
        var busquedaMultiple =catalogoRopa.filter{
            it.categoria==categoria || it.stock==stock || it.precio==precio || it.descatalogado==descatalogado || it.seccion==seccion || it.talla==talla}
        
        var busquedaMultiple2 =catalogoCalzado.filter{
            it.categoria==categoria || it.stock==stock || it.precio==precio || it.descatalogado==descatalogado || it.seccion==seccion || it.talla==talla2}
        
        if(busquedaMultiple.size==0){
            if(busquedaMultiple2.size==0){
                println("No hay ningun producto con estas características")
            }else{
                 mostrarColeccionDeCalzado(busquedaMultiple2)
            }
        }else{
            mostrarColeccionDeRopa(busquedaMultiple)
            /*busquedaMultiple.forEach{
                println(" ${it.QR}, ${it.categoria}, ${it.descripcion}, ${it.stock} uds, ${it.precio}€, ${it.descatalogado}, ${it.seccion}, ${it.talla}")
            }*/
        }
    }               
	
	// venderArticulo() actualiza el "stock" tras vender "cantidad" unidades de ropa con id="id".
	public fun venderArticulo (id: UInt, cantidad: UByte = 1U) {
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/
        println("")
        println("VENTAS")
        var ropaId= catalogoRopa.filter{it.QR==id}
        var calzadoId=catalogoCalzado.filter{it.QR==id}
        if(ropaId.size==0){
            if(calzadoId.size==0){
                println("No existe este producto")
            }else{
                 calzadoId.forEach{
                     var resultado = it.stock - cantidad
                     if(resultado.toUByte()<=0u){													
                        it.stock=0u
                        println("No hay stock")
                     }else{
                        it.stock=resultado.toUByte()
                        println("Ahora el stock de ${it.stock} unidades")
                     }  
                        //it.vender(cantidad)
                }
            }
            
        }else{
            ropaId.forEach{
                 var resultado = it.stock - cantidad
                 if(resultado.toUByte()<=0u){													
                    it.stock=0u
                    println("No hay stock")
                 }else{
                    it.stock=resultado.toUByte()
                    println("Ahora el stock de ${it.stock} unidades")
                 }  
                    //it.vender(cantidad)
            } 
        }  
    }

	
	// reponerArticulo() actualiza el "stock" tras reponer "cantidad" unidades de ropa con id="id".
	public fun reponerArticulo (id: UInt, cantidad: UByte = 1U) {
        /*CONTINÚA CON TU CÓDIGO A PARTIR DE AQUÍ...*/
        println("")
        println("REPONER")
        var ropaId= catalogoRopa.filter{it.QR==id}
        if(ropaId.size==0){
              println("No existe este producto")
        }else{
            ropaId.forEach{
                 var resultado = it.stock + cantidad
                 if(resultado.toUByte()>=250u){													
                    it.stock=250u
                    println("No CABE MAS stock")
                 }else{
                    it.stock=resultado.toUByte()
                    println("Ahora el stock de ${it.stock} unidades")
                 }  
                    //it.reponer(cantidad)
            } 
        } 
    }      
}

//***********************************************************************************************
// FIN DE LA CLASE Tienda *********************************************************************** 
//***********************************************************************************************


object referencia {								

	var id = mutableListOf(0)					

    fun generar(): UInt{
      var rand = 1
      var valido: Boolean =false  
      do{
          if(id.contains(rand)){					
             rand++;		
          }else{
             id.add(rand)
             valido=true
             
          }	     
      }while(!valido)
	  return rand.toUInt() 
    }
}

open class Producto{
   var QR: UInt=referencia.generar()			//UInt: unsigned int
   var categoria: Categoria=Categoria.SC
   var descripcion: String=""
   var stock: UByte=0u
   set(value){													//comprobar que el stock cumple las nomras(de 0 a 250)
       if(value>250u){
           field=250u
       }else if(value<0u){
          field=0u 
       }else{
           field=value
       }
   } 
   var precio: Double=0.00										//Asegurarse que el precio no sea negativo
   set(value){
       if(value<0.00){
           field=0.00
       }else{
           field=value
       }
   }
   var descatalogado: Boolean=true
   set(value){													//Comprobar que esta descatalogado mediate el stock
       if(stock>0u){
           field=false
       }else{
          field=true 
       }
   }
    
   //Constructor con parametros
   constructor(categoria: Categoria, descripcion: String, stock: UByte, precio: Double, descatalogado: Boolean){
       this.categoria = categoria
       this.descripcion = descripcion
       this.stock = stock
       this.precio = precio
       this.descatalogado=descatalogado
   }
   
   fun vender(cantidad: UByte){
       
       var resultado = this.stock - cantidad
       if(resultado.toUByte()<=0u){													
           this.stock=0u
           println("No hay stock")
       }else{
           this.stock=resultado.toUByte()
           println("Ahora el stock de ${this.stock} unidades")
       }  
   }
   
   fun reponer(cantidad: UByte){
       var resultado = this.stock + cantidad
       if(resultado.toUByte()>250u){													
           this.stock=250u
           println("No se puede almacenar más")
       }else{
           this.stock=resultado.toUByte()
           println("Ahora el stock de ${this.stock} unidades")
       } 
   }
}

   
enum class Categoria{
    CALZADO, ROPA, HOGAR, COMPLEMENTOS, SC
}

class Ropa: Producto{ //hereda de Producto
    var seccion: Secciones=Secciones.HOMBRE
    var talla: TallasRopa=TallasRopa.XXS

    //Metodo constructor de ropa(Con todos los parametros)
    constructor (categoria: Categoria, descripcion: String, stock: UByte, precio: Double, descatalogado:Boolean, seccion: Secciones, talla: TallasRopa)
    	: super(categoria, descripcion, stock, precio, descatalogado){
        this.seccion=seccion
        this.talla=talla
    }

}

enum class Secciones{
    HOMBRE, MUJER, NIÑOS, COMPLEMENTOS
}
enum class TallasRopa{
    XXS, XS, S, M, L, XL, XXL
}


class Calzado: Producto{
    var seccion: Secciones=Secciones.HOMBRE
    var talla: Double
    set(value){
       if(value<35.0){
           field=35.0
       }else if(value>51.0){
           field=51.0
       }else{
           field=value
       }
   }
    
    //Metodo constructor de ropa(Con todos los parametros)
    constructor (categoria: Categoria, descripcion: String, stock: UByte, precio: Double, descatalogado:Boolean, seccion: Secciones, talla: Double)
    	: super(categoria, descripcion, stock, precio, descatalogado){
        this.seccion=seccion
        this.talla=talla
    }
    
}


//***********************************************************************************************
//***********************************************************************************************
// FUNCIÓN main()                                                            ********************
// (Contiene código para poder probar la aplicación una vez finalizada)      ********************
// (SOLO LECTURA - PROHIBIDO MODIFICAR - SOLO LECTURA - PROHIBIDO MODIFICAR) ********************  
//***********************************************************************************************
//***********************************************************************************************

fun main() {   
    // Crea una tienda. (La colección de Ropa representa los artículos disponibles) 
    var miTienda = Tienda(crearColeccionDeRopa(), crearColeccionDeCalzado())
    
    // Muestra el catálogo completo de productos de la tienda.
    miTienda.mostrarCatalogoDeRopaCompleto()
    miTienda.mostrarCatalogoDeCalzadoCompleto()
    
    // Muestra los productos disponibles a través de varios ejemplos de filtros.
    miTienda.buscarPorId(2U)
    miTienda.buscarPorCategoria(Categoria.ROPA)
    miTienda.buscarPorStockMenorA(100U)
    miTienda.buscarPorPrecioMaximo(5.0)
    miTienda.buscarProductosDescatalogados()
    miTienda.buscarProductosPorTalla(TallasRopa.XS)
    miTienda.buscarProductosPorSeccion(Secciones.NIÑOS)
    miTienda.buscarProductos(seccion=Secciones.MUJER, talla=TallasRopa.L, precio=5.0)
    
    // Procesa una venta de 3 unidades de la prenda de ropa con id=1.
    miTienda.venderArticulo(1U,3U)
    
    // Procesa la reposición de 5 unidades de la prenda de ropa con id=1.
    miTienda.reponerArticulo(1U,5U)
    
    
    
}

//***********************************************************************************************
// FIN DE LA FUNCIÓN main() ********************************************************************* 
//***********************************************************************************************








//***********************************************************************************************
//***********************************************************************************************
// FUNCIÓN crearColeccionDeRopa(): List<Ropa>                                ********************
// (Crea una colección con 15 prendas de ropa para probar la aplicación)     ********************
// (SOLO LECTURA - PROHIBIDO MODIFICAR - SOLO LECTURA - PROHIBIDO MODIFICAR) ********************  
//***********************************************************************************************
//***********************************************************************************************

fun crearColeccionDeRopa(): List<Ropa> {
    var coleccionRopa = mutableListOf<Ropa>()
    
	var prenda = Ropa(categoria=Categoria.ROPA, descripcion="Una camisa roja",
                      stock=25U, precio=49.95, descatalogado=false, 
                      seccion=Secciones.HOMBRE, talla=TallasRopa.L)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Una camisa verde",
                  stock=50U, precio=49.95, descatalogado=false, 
                  seccion=Secciones.HOMBRE, talla=TallasRopa.XXL)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Una camisa azul",
                  stock=75U, precio=49.95, descatalogado=false, 
                  seccion=Secciones.HOMBRE, talla=TallasRopa.M)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Un abrigo negro",
                  stock=15U, precio=249.95, descatalogado=false, 
                  seccion=Secciones.HOMBRE, talla=TallasRopa.XL)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Una falda roja",
                  stock=25U, precio=39.95, descatalogado=false, 
                  seccion=Secciones.MUJER, talla=TallasRopa.XXL)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Una falda verde",
                  stock=50U, precio=39.95, descatalogado=false, 
                  seccion=Secciones.MUJER, talla=TallasRopa.L)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Una falda azul",
                  stock=75U, precio=39.95, descatalogado=false, 
                  seccion=Secciones.MUJER, talla=TallasRopa.M)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Un vestido amarillo",
                  stock=15U, precio=174.95, descatalogado=false, 
                  seccion=Secciones.MUJER, talla=TallasRopa.XL)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Una chaqueta ejecutiva",
                  stock=15U, precio=99.95, descatalogado=false, 
                  seccion=Secciones.MUJER, talla=TallasRopa.M)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Unos vaqueros de niño",
                  stock=125U, precio=19.95, descatalogado=false, 
                  seccion=Secciones.NIÑOS, talla=TallasRopa.S)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Una camiseta de niño",
                  stock=150U, precio=9.95, descatalogado=false, 
                  seccion=Secciones.NIÑOS, talla=TallasRopa.XS)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Pack de calcetines de niño",
                  stock=250U, precio=4.95, descatalogado=false, 
                  seccion=Secciones.NIÑOS, talla=TallasRopa.L)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Pack de calcetines de mujer",
                  stock=250U, precio=4.95, descatalogado=false, 
                  seccion=Secciones.MUJER, talla=TallasRopa.L)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Pack de calcetines de hombre",
                  stock=250U, precio=4.95, descatalogado=false, 
                  seccion=Secciones.HOMBRE, talla=TallasRopa.L)
    coleccionRopa.add(prenda)
    
    prenda = Ropa(categoria=Categoria.ROPA, descripcion="Una bufanda unisex",
                  stock=0U, precio=14.95, descatalogado=true, 
                  seccion=Secciones.COMPLEMENTOS, talla=TallasRopa.L)
    coleccionRopa.add(prenda)
	
    return coleccionRopa
}

fun crearColeccionDeCalzado(): List<Calzado> {
    var coleccionCalzado = mutableListOf<Calzado>()
    var prenda = Calzado(categoria=Categoria.CALZADO, descripcion="Zapatos negros",
                      stock=25U, precio=174.95, descatalogado=false, 
                      seccion=Secciones.HOMBRE,talla=46.0)
    coleccionCalzado.add(prenda)
    prenda = Calzado(categoria=Categoria.CALZADO, descripcion="Sandalias Naranjas",
                      stock=250U, precio=4.95, descatalogado=false, 
                      seccion=Secciones.MUJER,talla=39.0)
    coleccionCalzado.add(prenda)
    prenda = Calzado(categoria=Categoria.CALZADO, descripcion="Deportivas Nike",
                      stock=0U, precio=39.95, descatalogado=true, 
                      seccion=Secciones.NIÑOS,talla=42.5)
    coleccionCalzado.add(prenda)
	prenda = Calzado(categoria=Categoria.CALZADO, descripcion="Deportivas Adidas",
                      stock=125U, precio=59.95, descatalogado=false, 
                      seccion=Secciones.HOMBRE,talla=44.5)
    coleccionCalzado.add(prenda)
    prenda = Calzado(categoria=Categoria.CALZADO, descripcion="Zapatillas de casa",
                      stock=250U, precio=4.95, descatalogado=false, 
                      seccion=Secciones.HOMBRE,talla=40.0)
    coleccionCalzado.add(prenda)
	
    return coleccionCalzado
}

//***********************************************************************************************
// FIN DE LA FUNCIÓN crearColeccionDeRopa(): List<Ropa> ***************************************** 
//***********************************************************************************************