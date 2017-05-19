package Calc;

/**
 *
 * @author Juan
 */
enum TipoEmpleado {

    vendedor, encargado
};

public class EmpleadoBR {
    //private float ventasMes,horasExtra,salarioBruto;

    float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra) throws BRException {
        /*this.ventasMes=ventasMes;
         this.horasExtra=horasExtra;
         TipoEmpleado=tipo;*/
        int base = 0, prima = 100;
        float h;
        if (tipo == TipoEmpleado.vendedor) {
            base = 1000;
        } else if (tipo == TipoEmpleado.encargado) {
            base = 1500;
            if (ventasMes >= 1000) {
                base += prima;
            } else if (ventasMes < 1500) {
                base += 200;
            }
        }

        h = horasExtra * 20;
        if (tipo == null || ventasMes < 0 || horasExtra < 0) {
            throw new BRException("error");
        }
        return base + h;
    }

    float calculaSalarioNeto(float salarioBruto) throws BRException {
        int retencion = 0;
        if (salarioBruto < 1000) {
            retencion = 0;
            return salarioBruto;
        } else if (salarioBruto > 1000 && salarioBruto < 1500) {
            retencion = ((int) salarioBruto * 16) / 100;
            return salarioBruto * (1 - retencion);
        } else if (salarioBruto > 1500) {
            retencion = ((int) salarioBruto * 18) / 100;
            return salarioBruto * (1 - retencion);
        }
        return -1;
    }

}

class BRException extends Exception {

    public BRException(String msj) {
        super(msj);
    }
}
