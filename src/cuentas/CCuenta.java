package cuentas;


/**
 * 
 * @author Alicia
 *@since 13/03/2022
 *
 */
public class CCuenta {
	
	/**
	 *  Esta clase establece los parametros ce creacion de CCuenta
	 */
	
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * 
     * @param estado
     * @return devuelve el valor alctual del saldo
     * 
     */

    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * 
     * Realiza el ingreso de dienro en la cuenta
     * @param cantidad
     * @throws Exception, tiene que cumplir las condiciones de ser mayor a 0.
     * 
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * 
     * Realiza la retirada de dinero de la cuenta
     * @param cantidad
     * @throws Exception, tiene que cumplir la condicion de ser mayor a 0.
     * 
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * 
     * Medotos getter y setter de nombre
     * @param nombre 
     * @return establece y muestra el nombre
     * 
     */
	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * Metodos getter y setter de cuenta
	 * @param cuenta
	 * @return establece y devuelve el numero de cuenta
	 * 
	 */

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * 
	 * Metodos getter y setter de saldo
	 * @param saldo
	 * @return devuelve el valor del saldo de la cuenta
	 * 
	 */

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * 
	 * Metodos getter y setter del tipo de ineteres
	 * @param tipoInteres
	 * @return devuelve el valor que tiene el tipo de interes
	 * 
	 */

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

}
