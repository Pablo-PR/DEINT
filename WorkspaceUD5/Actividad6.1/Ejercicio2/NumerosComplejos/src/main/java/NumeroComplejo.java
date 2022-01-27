
import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class NumeroComplejo {
    private float parteReal;
    private float parteImaginaria;
    
    public NumeroComplejo(float parteReal, float parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
    
    public NumeroComplejo suma(NumeroComplejo num2) {
        NumeroComplejo resultado;
        
        float resultadoParteReal = parteReal + num2.parteReal;
        float resultadoParteImaginaria = parteImaginaria + num2.parteImaginaria;
        
        resultado = new NumeroComplejo(resultadoParteReal, resultadoParteImaginaria);
        
        return resultado;
    }
    
    public NumeroComplejo division(NumeroComplejo num2) {
        NumeroComplejo resultado;
        
        float resultadoParteReal = ((parteReal * num2.parteReal) + (parteImaginaria * num2.parteImaginaria)) / ((num2.parteReal * num2.parteReal) + (num2.parteImaginaria * num2.parteImaginaria));
        float resultadoParteImaginaria = ((parteImaginaria * num2.parteReal) - (parteReal * num2.parteImaginaria)) / ((num2.parteReal * num2.parteReal) + (num2.parteImaginaria * num2.parteImaginaria));
        
        resultado = new NumeroComplejo(resultadoParteReal, resultadoParteImaginaria);
        
        return resultado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Float.floatToIntBits(this.parteReal);
        hash = 97 * hash + Float.floatToIntBits(this.parteImaginaria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NumeroComplejo other = (NumeroComplejo) obj;
        if (Float.floatToIntBits(this.parteReal) != Float.floatToIntBits(other.parteReal)) {
            return false;
        }
        if (Float.floatToIntBits(this.parteImaginaria) != Float.floatToIntBits(other.parteImaginaria)) {
            return false;
        }
        return true;
    }
}