// somar(int n1,int n2){}
//abrirConexao(){}
//findById(int id){}
/*exemplo de uma classe de uma smart tv
 * caracteristicas : ligada(boolean),canal(int) e volume(int)
 * nossa tv podera ligar e desligar e assim mudar o estado ligada
 * nota tv aumentara e diminuira o voluma sempre em +1 ou -1
 * nossa tv podera mudar de canal de 1 em 1 ou definindo o numero
 * correspondente
 */


public class Metodos {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
}
