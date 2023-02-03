package com.adriaanbf04.tema07.ejercicio07;

public class Ingreso {
    private Paciente paciente;
    private String fechaEntrada;
    private String horaEntrada;
    private float[] preRev;
    private String sintomantologia;
    private String fechaAlta;
    private String motivoAlta;

    public Ingreso(Paciente paciente, String fechaEntrada, String horaEntrada, String sintomantologia,float[] preRev) {
        this.paciente = paciente;
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;
        this.sintomantologia = sintomantologia;
        this.preRev = new float[4];
        fechaAlta = "";
        motivoAlta = "";
    }


    public float[] getPreRev() {
        return preRev;
    }

    public float[] anyadirPreRev(int one, int two, int three, int four) {
        float[] res = new float[4];
        for (int i = 0; i < res.length; i++) {
            switch(i) {
                case 0:
                    res[i] = one;
                    break;
                case 1:
                    res[i] = two;
                    break;
                case 2:
                    res[i] = three;
                    break;
                case 3:
                    res[i] = four;
                    break;
            }
        }
        return res;
    }
}
