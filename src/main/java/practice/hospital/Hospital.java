package practice.hospital;
import java.util.Arrays;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientsTemperature = new float[patientsCount];
        for (int i = 0; i < patientsTemperature.length; i++) {
            patientsTemperature[i] = Math.round(((float) (Math.random() * (40.0 - 32.0)) + 32.0) * 10) / 10f;
        }
        return patientsTemperature;
    }

    public static String getReport(float[] temperatureData) {
        double average = 0;
        if (temperatureData.length > 0) {
            double sum = 0;
            for (int j = 0; j < temperatureData.length; j++) {
                sum += temperatureData[j];
            }
            average = sum / temperatureData.length;
        }

        int countHealthyPatients = 0;
        for (float temperaturePatient : temperatureData){
            if (temperaturePatient >= 36.2f && temperaturePatient <= 36.9f) {
                countHealthyPatients++;
            }
        }

        String report =
            "Температуры пациентов: " + Arrays.toString(temperatureData).replaceAll("[\\[,\\]]","") +
            "\nСредняя температура: " + String.format("%.2f", average)+
            "\nКоличество здоровых: " + countHealthyPatients;

        return report;
    }
}
