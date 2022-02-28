package mundo;

public class Empleado
{
	//------------------------------------------------
	//Atributos
	//------------------------------------------------
	private String nombre;
	private int    cedula;
	private String direccion;
	private double salarioBase;
	private double porcentajeRetencion;
	
	//----------------------------------------------
	//Constructor
	//---------------------------------------------
	public Empleado( String pNombre, int pCedula, String pDireccion, double pSalarioBase, double pPorcentajeRetencion )
	{
		nombre = pNombre;
		cedula = pCedula;
	    direccion = pDireccion;
	    salarioBase = pSalarioBase;
		porcentajeRetencion = pPorcentajeRetencion;
	}
	
	
	//------------------------------------------
	//Metodos
	//-----------------------------------------
	
	public double calcularDescuento( )
	{
		return salarioBase*porcentajeRetencion /100;
		
	}
	public double calcularSalarioPorPagar( )
	{
		return salarioBase - calcularDescuento( );
	}
	
	//Get
	
	public int getCedula( )
	{
		return cedula;
	}
	public String getNombre( )
	{
		return nombre;
	}
	public String getDireccion( )
	{
		return direccion;
	}
	public double getSalarioBase( )
	{
		return salarioBase;
	}
	public double getPorcentajeRetencion( )
	{
		return porcentajeRetencion;
	}
	
	//Set
	
	public void setNombre(String pNombre)
	{
		nombre = pNombre;
	}
	public void setCedula(String pCedula)
	{
		cedula = pCedula;
	}
	public void setDireccion(String pDireccion)
	{
		direccion = pDireccion;
	}
	public void setSalarioBase(double pSalarioBaswe)
	{
		salarioBase = pSalarioBase;
	}
	public void setPorcentajeRetencion(double pPorcentajeRetencion)
	{
		porcentajeRetencion = pPorcentajeRetencion;
	}	
}
