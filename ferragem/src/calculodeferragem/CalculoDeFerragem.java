package calculodeferragem;

import java.math.BigDecimal;

public class CalculoDeFerragem {

    //---------------------------------------------------
    //Calculos
    //---------------------------------------------------
    public double calculoTotalEstribo(double estriboAltura, double estriboLargura) {
        double xx = ((estriboAltura * 2) + (estriboLargura * 2) + 10);
        BigDecimal yy = new BigDecimal(xx);
        yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
        double estriboTotal = yy.doubleValue();
        return estriboTotal;
    }

    public double calculoQtdeEstribos(double comprimento, double espacoEstribo, double qtdeFerragem) {
        double xx = ((comprimento / (espacoEstribo / 100)) * qtdeFerragem);
        BigDecimal yy = new BigDecimal(xx);
        yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
        double qtdeEstribos = yy.doubleValue();
        return qtdeEstribos;
    }

    public double calculoQtdeBarrasColunas(double qtdeFerragem, double comprimento, int qtdeFerro) {
        double xx = (qtdeFerragem * comprimento * qtdeFerro) / 12;
        BigDecimal yy = new BigDecimal(xx);
        yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
        double quantidadeBarrasColunas = yy.doubleValue();
        return quantidadeBarrasColunas;
    }

    public double calculoQtdeBarrasEstribos(double comprimento, double espacoEstribo, double qtdeFerragem, double estriboTotal) {
        double xx = ((comprimento / (espacoEstribo / 100) * qtdeFerragem) / (12 / (estriboTotal / 100)));
        BigDecimal yy = new BigDecimal(xx);
        yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
        double quantidadeBarrasEstribos = yy.doubleValue();
        return quantidadeBarrasEstribos;
    }

    public double calculoQtdeArames(double comprimento, double espacoEstribo, double qtdeFerragem, double qtdeFerro) {
        double xx = ((comprimento / (espacoEstribo / 100) * qtdeFerragem) * (qtdeFerro / 200));
        BigDecimal yy = new BigDecimal(xx);
        yy = yy.setScale(2, BigDecimal.ROUND_HALF_UP);
        double quantidadeArames = yy.doubleValue();
        return quantidadeArames;

    }
}
