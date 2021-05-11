package mx.uam.is.practicadiseno.negocio;

import mx.uam.is.practicadiseno.datos.MapeadorDatos;

public class ManejadorImpl implements Manejador {
	private MapeadorDatos mapeadorDatosImpl;
	
	/**
	 * Constructor conecta el mapeadorDatos
	 *
	 */
	public ManejadorImpl(MapeadorDatos mapeadorDatosImpl) {
		this.mapeadorDatosImpl = mapeadorDatosImpl;
	}

	/**
	 * Metodo llamado cuando se cierra la ventana
	 *
	 */
	public void finaliza() {
		System.exit(0);
	}

	@Override
	public String[] dameDatos() {
		return mapeadorDatosImpl.dameDatos();
	}

	@Override
	public boolean agrega(String dato) {
		return mapeadorDatosImpl.agrega(dato);
	}

	@Override
	public boolean borra(String dato) {
		return mapeadorDatosImpl.borra(dato);
	}
}
