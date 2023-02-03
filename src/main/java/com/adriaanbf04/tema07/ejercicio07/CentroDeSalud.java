package com.adriaanbf04.tema07.ejercicio07;

import com.adriaanbf04.tema07.UtillsAdri.IO;
import com.adriaanbf04.tema07.ejercicio07.Paciente;
import com.github.javafaker.Faker;
import java.util.GregorianCalendar;

public class CentroDeSalud {
    private Paciente[] pacientes;
    private Ingreso[] atendidos;
    private Ingreso ingreso;
    private Paciente paciente;
    private Faker faker;
    private int contadorPacientes;
    private int contadorAtendidos;
    private GregorianCalendar gregorianCalendarIn;
    private GregorianCalendar gregorianCalendarFin;
    private GregorianCalendar gregorianCalendar;
    public CentroDeSalud(int maxPacientes) {
        pacientes = new Paciente[maxPacientes];
        contadorPacientes = 0;
        contadorAtendidos = 0;
        faker = new Faker();
        gregorianCalendar = new GregorianCalendar();
    }
    /**
     * Este método controla cuantos pacientes se pueden añadir (si llega al límite te impide añadir más)
     * @return Booleano sobre si se puede añadir el paciente o no
     */
    public boolean nuevoPaciente() {
        if (contadorPacientes > 0) {
            anyadirPacienteAleatorios();
            return true;
        }
        return false;
    }
    /**
     * Método creado para añadir pacientes aleatorios
     */
    private void anyadirPacienteAleatorios() {
        int sip = faker.number().numberBetween(11111111,99999999);
        String nombre = faker.name().firstName();
        int randomNum = faker.number().numberBetween(1,2);
        char sexo = ' ';
        if (randomNum == 1) {
            sexo = 'H';
        } else if (randomNum == 2){
            sexo = 'M';
        }
        int edad = faker.number().numberBetween(1,120);

        pacientes[contadorPacientes] = new Paciente(sip,nombre,sexo,edad);
        contadorPacientes++;
    }

    public boolean atendido(int sip) {
        int posPaciente = buscarSip(sip);
        if (!(atendidos[posPaciente].getPreRev() == null)) {
            return true;
        }
        return false;
    }

    private int buscarSip(int sip) {
        for (int i = 0; i < contadorPacientes; i++) {
            int sipBuscado = pacientes[i].getSip();
            if (sipBuscado == sip) {
                return i;
            }
        }
        return -1;
    }

    public boolean atenderPaciente(String fechaEntrada, String horaEntrada, String sintomantologia,int temp,int ppm,int tenSis,int tenDia) {
        if (contadorPacientes < atendidos.length) {
            float[] preRev = ingreso.anyadirPreRev(temp,ppm,tenSis,tenDia);
            anyadirPaciente(fechaEntrada,horaEntrada,sintomantologia,preRev);
            return true;
        }
        return false;
    }

    private void anyadirPaciente(String fechaEntrada, String horaEntrada, String sintomantologia, float[] preRev) {
        atendidos[contadorAtendidos] = new Ingreso(pacientes[contadorPacientes],fechaEntrada,horaEntrada,sintomantologia,preRev);
        contadorAtendidos++;
    }

    public String buscarPorSip(int sipIntroducido) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contadorAtendidos; i++) {
            int sipAtendidos = pacientes[i].getSip();
            if (sipAtendidos == sipIntroducido) {
               return sb.append(atendidos[i].toString()).toString();
            }
        }
        return " ";
    }

    public Paciente[] buscarPorFechas(String fechaIn,String fechaFin) {
        return pacientes;
    }

    public int mediaTemperatura() {
        return -1;
    }

    public int mediaPulsaciones() {
        return -1;
    }
    public int mediaTensionArterial() {
        return -1;
    }
    public int mediaEdadPacientes() {
        int contador = 0;
        for (int i=0; i<contadorAtendidos;i++) {
            int edad = pacientes[i].getEdad();
            edad += contador;
        }
        return contador/contadorPacientes;
    }
    public double porcentajeHombres() {
        int contador = 0;
        for (int i=0; i<contadorAtendidos;i++) {
            if (pacientes[i].getSexo() == 'H') {
                contador++;
            }
        }
        return (double)(contador/contadorAtendidos)*100;
    }
    public double porcentajeMujeres() {
        int contador = 0;
        for (int i=0; i<contadorAtendidos;i++) {
            if (pacientes[i].getSexo() == 'M') {
                contador++;
            }
        }
        return (double)(contador/contadorAtendidos)*100;
    }

    public Ingreso[] historialMedico() {
        return atendidos;
    }

    public boolean altaMedica(int sip, String motivo, String fechaAlta) {
        
        return false;
    }
}
