public class ModuloFunciones {

    public static boolean validarPeso (double peso){
        boolean pesoValidado;
        if(peso > 0 && peso <= 50){
            pesoValidado = true;
            return pesoValidado;
        }else{
            pesoValidado = false;
            return pesoValidado;
        }
    }
    public static double calcularTarifaBase (double peso) {
        double tarifaInicial = 0;
        if (peso > 0 && peso <= 1) {
            tarifaInicial = 5;
        } else if (peso > 1 && peso <= 5) {
            tarifaInicial = 10;
        }else if (peso > 5 && peso <= 20){
            tarifaInicial = 20;
        }else {
            tarifaInicial = 50;
        }
        return tarifaInicial;
    }
    public static double calcularRecargoDistancia (int km) {
        double recargoDistancia = 0;
        if (km <= 10) {
            recargoDistancia = 0;
        } else if (km > 10 && km <= 50) {
            recargoDistancia = 5;
        }else if (km > 50 && km <= 200){
            recargoDistancia = 15;
        }else {
            recargoDistancia = 30;
        }
        return recargoDistancia;
    }
    public static double calcularRecargoTipo(String tipo){
        double recargoTipo = 0;
        switch (tipo){
            case "normal":
                recargoTipo = 0;
                break;
            case "express":
                recargoTipo = 15;
                break;
            case "prioritario":
                recargoTipo = 30;
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        return recargoTipo;
    }
    public static String generarResumen(double peso, int km, String tipo){
        double total = calcularTarifaBase(peso) + calcularRecargoDistancia(km) + calcularRecargoTipo (tipo);
        String guiones = "";
        for (int i = 0; i < 30; i++){
            guiones += "-";
        }
        String lineaGuiones = guiones;
        String resumenGeneral = "\nRESUMEN GENERAL: ";
        String tarifa = "\nLa tarifa base es: " + calcularTarifaBase (peso);
        String recargoPorDistancia = "\nEl recargo por distancia es: " + calcularRecargoDistancia (km);
        String recargoPorTipo = "\nEl recargo por tipo es: " + calcularRecargoTipo (tipo);
        String resumenTotal = lineaGuiones + resumenGeneral + tarifa + recargoPorDistancia + recargoPorTipo + "\nEl total final es: " + total;
        return resumenTotal;
    }
}
