package Exception;

import java.lang.Exception;

public class Data {
	private int dia, mes;
    private int ano;
    private boolean dcs = false;
  
    private int finaldia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public void setAno(int ano) throws DataException, AnoException {
        if (ano < 0)
            throw new DataException();
          
        if(ano % 4 == 0) {
        	//this.finaldia[1] = 29; // Ao mudar o valor de dia final para 29, o else if do método setDia não executa.
            this.ano = ano;
        	this.dcs = true;
        } else {
        	this.ano = ano;
            this.finaldia[1] = 28;
            this.dcs = false;
        }
    }

    public void setMes(int mes) throws DataException{
        if (mes < 1 || mes >12)
            throw new DataException();
        this.mes = mes;
    }
  
    public void setDia(int dia) throws DiaException, AnoException {
        if (dia >= 1 || dia <= 31) {
			if (dia<=finaldia[mes-1]) {
			    this.dia = dia;
			} else if (dia==29 && dcs==true && mes==2){
			    this.dia = dia;
			    System.out.println("Ano Bissexto! - " + this.dia + "/" + this.mes + "/" + this.ano);
			} else if (dia==29 && dcs==false && mes==2) {
				System.out.println(dia + "/" + this.mes + "/" + this.ano);
				throw new AnoException();
			} else {
				System.out.println(dia + "/" + this.mes + "/" + this.ano);
				throw new DiaException();
			}
        }
    }
  
    public static void main(String[] args)throws DataException, AnoException {
      
    /*    Data natal = new Data();
        try{
        natal.setDia((byte)33);
        }catch(DataException ex){
            System.out.println("Erro ao setar o dia");
            System.out.println("msg:" + ex.getMessage());
            
        }
        try{
        natal.setMes((byte)14);
        }catch(DataException ex){
            System.out.println("Erro ao setar o mês");
            System.out.println("msg:" + ex.getMessage());
            System.out.println("causa:" + ex.getCause());
            System.out.println("classe:" + ex.getClass());
        }
        try{
        natal.setAno((short)-25);
        }catch(DataException ex){
            System.out.println("Erro ao setar o ano");
            System.out.println("msg:" + ex.getMessage());
            System.out.println("causa:" + ex.getCause());
            System.out.println("classe:" + ex.getClass());
            
        }
        finally{
            //arquivo.close();
            System.err.println("Sou sempre executado para liberar recursos alocados");
        }
      */

      Data al = new Data();
      
      al.setAno(2019);
      al.setMes(4);
      al.setDia(31);
    }

}
