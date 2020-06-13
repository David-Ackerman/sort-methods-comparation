import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class MontarArray {
	
	private String csvArquivo;
	private BufferedReader conteudoCSV = null;
	private String linha = "";
	int escolha = 0;
	String vetm = null;
	Float[] dados;
	String teste ;
	int l = 0;
	
	public Float[]  montar(String n) {
			
		csvArquivo = defArquivo(n);	
		try {
			if (csvArquivo != null) {
				
				conteudoCSV = new BufferedReader(new FileReader(csvArquivo));
				boolean a = false;
				while ((linha = conteudoCSV .readLine())!= null) {	
					
					if(a == true) {
						teste = teste.concat("\n").concat(linha);
					}
					else {
						teste = linha;
						a = true;
					}			
				}
			}
			
			
		} catch (FileNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, "arquivo não encontrado: \n" + e.getMessage());
			
		} catch (IOException e) {
			
			JOptionPane.showMessageDialog(null, "io exception \n" + e.getMessage());
			
		}catch (ArrayIndexOutOfBoundsException e) {
			
			JOptionPane.showMessageDialog(null, "index nao permitido \n" + e.getMessage());	
			
		} finally {
			
			if (conteudoCSV != null) {
				
				try {
					
					conteudoCSV.close();										
					dados = Arrays.stream(teste.split("\n")).map(Float::valueOf).toArray(Float[]::new);
					//JOptionPane.showMessageDialog(null, "Array montada e pronta para ser ordenada");								
				
				} catch (IOException e){	
					
					JOptionPane.showMessageDialog(null, "io exception \n" + e.getMessage());	
				}
				
			}else if(vetm != null) {
				dados = Arrays.stream(vetm.split(",")).map(Float::valueOf).toArray(Float[]::new);
				//JOptionPane.showMessageDialog(null, "Array montada e pronta para ser ordenada");
			}							
		}
		return dados;
	}
	
	
	public String defArquivo (String escolha) {
		
		String arquivo = null;
		
		switch (escolha) {
		
			case "1":
				arquivo = "C:\\Users\\David\\eclipse-workspace\\Aps4\\1mil_0_ordenado.CSV";
				break;
			case "2":
				arquivo = "C:\\Users\\David\\eclipse-workspace\\Aps4\\1mil_25_ordenado.CSV";
				break;
			case "3":
				arquivo = "C:\\Users\\David\\eclipse-workspace\\Aps4\\1mil_50_ordenado.CSV";
				break;
			case "4":
				arquivo = "C:\\Users\\David\\eclipse-workspace\\Aps4\\1mil_75_ordenado.CSV";
				break;
			case "5":
				arquivo = "C:\\Users\\David\\eclipse-workspace\\Aps4\\10mil_0_ordenado.CSV";
				break;
			case "6":
				arquivo = "C:\\Users\\David\\eclipse-workspace\\Aps4\\10mil_25_ordenado.CSV";
				break;
			case "7":
				arquivo = "C:\\Users\\David\\eclipse-workspace\\Aps4\\10mil_50_ordenado.CSV";
				break;
			case "8":
				arquivo = "C:\\Users\\David\\eclipse-workspace\\Aps4\\10mil_75_ordenado.CSV";
				break;
			case "9":
				arquivo = "C:\\Users\\David\\eclipse-workspace\\Aps4\\100mil_0_ordenado.CSV";
				break;
			case "10":
				arquivo = "C:\\Users\\David\\eclipse-workspace\\Aps4\\100mil_25_ordenado.CSV";
				break;				
			case "11":
				arquivo = "C:\\Users\\David\\eclipse-workspace\\Aps4\\100mil_50_ordenado.CSV";
				break;				
			case "12":
				arquivo = "C:\\Users\\David\\eclipse-workspace\\Aps4\\100mil_75_ordenado.CSV";
				break;
			case "13":
				
				vetm = JOptionPane.showInputDialog("Digite os numero a serem salvos no vetor, use virgulas para\n "
						+ "separar os numeros e pontos para numeros decimais\n\n"
						+ "           NÃO UTILIZE ESPAÇO OU LETRAS\n\n");
				
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção Inválida!!");
				break;
		}
		return arquivo;
	}
		
}
