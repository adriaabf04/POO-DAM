package com.adriaanbf04.tema07.ejercicio07;
import com.adriaanbf04.tema07.UtillsAdri.Array;
import com.adriaanbf04.tema07.UtillsAdri.IO;
import com.adriaanbf04.tema07.UtillsAdri.Menu;

import java.util.GregorianCalendar;

public class Ejercicio07 {
    public Ejercicio07() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        final int MAX_PACIENTES = 40*30;
        Menu menuUno = new Menu("URGENCIAS",4);
        Menu menuDos = new Menu("CONSULTAS",4);
        int opcionUno, opcionDos;
        CentroDeSalud centroDeSaludUno = new CentroDeSalud(MAX_PACIENTES);
        do {
            opcionUno = menuUno.executeFourOptions("1. Nuevo paciente", "2. Atender paciente","3. Consultas", "4. Alta médica");
            switch(opcionUno) {
                case 1:
                     if (!centroDeSaludUno.nuevoPaciente()) {
                        System.out.println("Paciente añadido");
                     } else {
                        System.out.println("No se pueden añadir nuevos pacientes");
                     }
                    break;
                case 2:
                    int sip = IO.readNumber("Introduce el SIP: ",11111111,99999999);
                    if (!centroDeSaludUno.atendido(sip)) {
                        //Método de pedir constantes vitales y añadir sus constantes a los datos del paciente
                        String anyo = String.valueOf(gregorianCalendar.get(GregorianCalendar.YEAR));
                        String mes = String.valueOf(gregorianCalendar.get(GregorianCalendar.MONTH));
                        String dia = String.valueOf(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
                        String hora = String.valueOf(gregorianCalendar.get(GregorianCalendar.HOUR));
                        String minutos = String.valueOf(gregorianCalendar.get(GregorianCalendar.MINUTE));
                        String fechaEntrada = anyo + "/" + mes + "/" + dia;
                        String horaEntrada = hora + ":" + minutos;
                        int temp = IO.readNumber("Introduce la temperatura",0);
                        int ppm = IO.readNumber("Introduce la ppm",0);
                        int tenSis = IO.readNumber("Introduce la tenSis",0);
                        int tenDias = IO.readNumber("Introduce la tenDias",0);
                        String sintomantologia = IO.readMessage("Introduce la sintomantologia",0);
                        centroDeSaludUno.atenderPaciente(fechaEntrada,horaEntrada,sintomantologia,temp,ppm,tenSis,tenDias);
                    } else {
                        System.out.println("El paciente ya ha sido atendido");
                    }
                    break;
                case 3:
                    do {
                        opcionDos = menuDos.executeFourOptions("1. Sip","2.Fechas","3. Estadisticas","4. Mostrar historico mensual");
                        switch(opcionDos) {
                            case 1:
                                int sipIntroduced = IO.readNumber("Introduce the SIP: ",11111111,99999999);
                                if (!(centroDeSaludUno.buscarPorSip(sipIntroduced).equalsIgnoreCase(" "))) {
                                    System.out.println(centroDeSaludUno.buscarPorSip(sipIntroduced));
                                } else {
                                    System.out.println("No existe el paciente");
                                }
                                break;
                            case 2:
                                String fechaIn = IO.readMessage("Introduce la fecha de entrada: ",10);
                                String fechaFin = IO.readMessage("Introduce la fecha de salida: ",10);
                                break;
                            case 3:
                                int mediaEdad = centroDeSaludUno.mediaEdadPacientes();
                                System.out.println(mediaEdad);
                                double porcHombres = centroDeSaludUno.porcentajeHombres();
                                System.out.println(porcHombres);
                                double porcMujeres = centroDeSaludUno.porcentajeMujeres();
                                System.out.println(porcMujeres);
                                break;
                            case 4:
                                Ingreso[] res = centroDeSaludUno.historialMedico();
                                break;
                        }
                    }while (opcionDos!=0);
                    break;
                case 4:
                    int sipIntroduced = IO.readNumber("Introduce el SIP: ",11111111,99999999);
                    String motivoAlta = IO.readMessage("Introduce el motivo de alta: ",0);
                    String anyo = String.valueOf(gregorianCalendar.get(GregorianCalendar.YEAR));
                    String mes = String.valueOf(gregorianCalendar.get(GregorianCalendar.MONTH));
                    String dia = String.valueOf(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
                    String fechaAlta = crearFecha(dia,mes,anyo);
                    if(centroDeSaludUno.altaMedica(sipIntroduced,motivoAlta,fechaAlta)) {
                        System.out.println("Paciente dado de alta");
                    } else {
                        System.out.println("No se le puede dar de alta");
                    }
                    break;
            }
        }while(opcionUno!=0);
    }
    private static String crearFecha(String dia, String mes, String anyo) {
        String fechaEntrada = anyo + "/" + mes + "/" + dia;
        return fechaEntrada;
    }
}
