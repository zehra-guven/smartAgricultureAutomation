package AKILLI_TARIM_OTOMASYONU1;
//stack set queue

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.StackWalker.StackFrame;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.*;



public class ANA_SINIF1 {

  public static void main(String[] args) {
	  
      //İLK AÇILAN PENCEREYİ OLUŞTURMA
      final JFrame frame = new JFrame("Türkiye'nin Coğrafi Bölgeleri");
      frame.setSize(700, 550);
      frame.setLayout(new FlowLayout());
      frame.setLocationRelativeTo(null);
      frame.getContentPane().setBackground(new Color(255, 192, 203));

      JLabel ekranresmi = new JLabel();
      Image img2 = new ImageIcon("C:\\Users\\pc\\Desktop\\resim.jpg").getImage();
      ekranresmi.setIcon(new ImageIcon(img2));
      frame.getContentPane().add(ekranresmi);

      //BUTONLARI OLUŞTURMA
//*******1.BUTON****
      //queue veri yapısı
      JButton button1 = new JButton("AKDENİZ BÖLGESİ");
      button1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              //****queue****
              AKDENİZ kuyrukQueue=new AKDENİZ();
              kuyrukQueue.elemankaydet("ELMA AĞACI VERİM:%55 ARMUT ");
              kuyrukQueue.elemankaydet("KESTANE AĞACI VERİM:%68");
              kuyrukQueue.elemankaydet("PİRİNÇ VERİM:%78 SUSAM VERİM:%59");
              kuyrukQueue.elemankaydet("PAPATYA VERİM:%48");

              while(!kuyrukQueue.isempty())
              {
                  System.out.println("AKDENİZ BÖLGESİNE UYGUN BİTKİ TÜRÜ:"+kuyrukQueue.elemansil());
              }

              JOptionPane.showMessageDialog(frame, "AKDENİZ BÖLGESİ İÇİN EN ÖNEMLİ TARIM ÜRÜNLERİ: \n ELMA AĞACI VERİM:%55  \n KESTANE AĞACI VERİM:%68 \n PİRİNÇ VERİM:%78 SUSAM VERİM:%59 \n PAPATYA VERİM:%48", "AKDENİZ BÖLGESİ", JOptionPane.INFORMATION_MESSAGE);
          }
      });

      frame.add(button1);
//******2.BUTON********
      //stack veri yapısı
      JButton button2 = new JButton("MARMARA BÖLGESİ");
      button2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              MARMARA stack1=new MARMARA();
              stack1.elemanekle("ARMUT AĞACI: VERİM:%69 KİVİ AĞACI VERİM:%78");
              stack1.elemanekle("KAVAK AĞACI: VERİM:%88");
              stack1.elemanekle("BUĞDAY: VERİM:%67");
              stack1.elemanekle("GÜL: VERİM:%57");
              while(!stack1.stackisempyt())
              {
                  //System.out.println(stack1.geleneleman());
                  System.out.println("MARMARA BÖLGESİNE UYGUN BİTKİ TÜRÜ:"+stack1.stacktensil());
              }
              JOptionPane.showMessageDialog(frame, "MARMARA BÖLGESİ İÇİN EN ÖNEMLİ TARIM ÜRÜNLERİ: \n ARMUT AĞACI: VERİM:%69 KİVİ AĞACI VERİM:%78 \n KAVAK AĞACI VERİM:%88 \n BUĞDAY VERİM:%67 \n GÜL VERİM:%57", "MARMARA BÖLGESİ", JOptionPane.INFORMATION_MESSAGE);
          }
      });
      frame.add(button2);
//*******3.BUTON**********
      JButton button3 = new JButton("EGE BÖLGESİ");
      button3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              System.out.println("EGE BÖLGESİ İÇİN EN ÖNEMLİ MEYVELİ AĞAÇ TÜRLERİ:ZEYTİN AĞACI VERİM:%90  NAR AĞACI VERİM:%88");
              System.out.println("EGE BÖLGESİ İÇİN EN ÖNEMLİ MEYVESİZ AĞAÇ TÜRLERİ: SARIÇAM AĞACI VERİM:%66");
              System.out.println("EGE BÖLGESİ İÇİN EN ÖNEMLİ TAHIL ÜRÜNLERİ: YULAF VERİM:%56");
              System.out.println("EGE BÖLGESİ İÇİN EN ÖNEMLİ ÇİÇEK ÇEŞİTLERİ:MENEKŞE VERİM:%78 SARDUNYA VERİM:%52");
              JOptionPane.showMessageDialog(frame, "EGE BÖLGESİ İÇİN EN ÖNEMLİ TARIM ÜRÜNLERİ: \n ZEYTİN AĞACI VERİM:%90  NAR AĞACI VERİM:%88 \n SARIÇAM AĞACI VERİM:%66 \n YULAF VERİM:%56 \n MENEKŞE VERİM:%78 SARDUNYA VERİM:%52", "EGE BÖLGESİ", JOptionPane.INFORMATION_MESSAGE);
          }
      });
      frame.add(button3);
//*******4.BUTON**********
      //set veri yapısı
      JButton button4 = new JButton("KARADENİZ BÖLGESİ");
      button4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              TreeSet karadenizSet=new TreeSet();
              karadenizSet.add("FINDIK AĞACI VERİM:%80 CEVİZ AĞACI VERİM:%50");
              karadenizSet.add("KESTANE AĞACI VERİM:%52 MEŞE AĞACI VERİM:%63 GÜRGEN AĞACI VERİM:%77");
              karadenizSet.add("ÇELTİK VERİM:%44 YULAF VERİM:%67 MISIR VERİM:%94");
              karadenizSet.add("GÜL VERİM:%41 KURTPENÇESİ VERİM:%89");

              System.out.println("KARADENİZ BÖLGESİ İÇİN EN ÖNEMLİ MEYVELİ AĞAÇ TÜRLERİ:FINDIK AĞACI VERİM:%80 CEVİZ AĞACI VERİM:%50");
              System.out.println("KARADENİZ BÖLGESİ İÇİN EN ÖNEMLİ MEYVESİZ AĞAÇ TÜRLERİ:KESTANE AĞACI VERİM:%52 MEŞE AĞACI VERİM:%63 GÜRGEN AĞACI VERİM:%77");
              System.out.println("KARADENİZ BÖLGESİ İÇİN EN ÖNEMLİ TAHIL ÜRÜNLERİ:ÇELTİK VERİM:%44 YULAF VERİM:%67 MISIR VERİM:%94");
              System.out.println("KARADENİZ BÖLGESİ İÇİN EN ÖNEMLİ ÇİÇEK ÇEŞİTLERİ:GÜL VERİM:%41 KURTPENÇESİ VERİM:%89");

              JOptionPane.showMessageDialog(frame, "AKDENİZ BÖLGESİ İÇİN EN ÖNEMLİ TARIM ÜRÜNLERİ: \n FINDIK AĞACI VERİM:%80 CEVİZ AĞACI VERİM:%50 \n KESTANE AĞACI VERİM:%52 MEŞE AĞACI VERİM:%63 GÜRGEN AĞACI VERİM:%77 \n ÇELTİK VERİM:%44 YULAF VERİM:%67 MISIR VERİM:%94 \n GÜL VERİM:%41 KURTPENÇESİ VERİM:%89", "KARADENİZ BÖLGESİ ", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("fındık.jpg"));

          }
      });

      frame.add(button4);
//********5.BUTON*******

      JButton button5 = new JButton("İÇ ANADOLU BÖLGESİ");
      button5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              System.out.println("İÇ ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ MEYVELİ AĞAÇ TÜRLERİ:VİŞNE AĞACI VERİM:% 64 İNCİR AĞACI VERİM:%69");
              System.out.println("İÇ ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ MEYVESİZ AĞAÇ TÜRLERİ: MEŞE AĞACI VERİM:%74");
              System.out.println("İÇ ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ TAHIL ÜRÜNLERİ: PİRİNÇ VERİM:%78 ŞEKER PANCARI VERİM:%89");
              System.out.println("İÇ ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ ÇİÇEK ÇEŞİTLERİ:LALE VERİM:%84 ORKİDE VERİM:%56");
              JOptionPane.showMessageDialog(frame, "İç ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ TARIM ÜRÜNLERİ:\n VİŞNE AĞACI VERİM:% 64 İNCİR AĞACI VERİM:%69 \n MEŞE AĞACI VERİM:%74 \n PİRİNÇ VERİM:%78 ŞEKER PANCARI VERİM:%89 \n LALE VERİM:%84 ORKİDE VERİM:%56", "İÇ ANADOLU BÖLGESİ", JOptionPane.INFORMATION_MESSAGE);
          }
      });
      frame.add(button5);
//*******6.BUTON*******
      JButton button6 = new JButton("DOĞU ANADOLU BÖLGESİ");
      button6.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              System.out.println("DOĞU ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ MEYVELİ AĞAÇ TÜRLERİ:ARMUT AĞACI VERİM:% 74 KAYISI AĞACI VERİM:%59");
              System.out.println("DOĞU ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ MEYVESİZ AĞAÇ TÜRLERİ: ÇAM AĞACI VERİM:%74");
              System.out.println("DOĞU ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ TAHIL ÜRÜNLERİ: MERCİMEK VERİM:%59 ÇAVDAR VERİM:%50");
              System.out.println("DOĞU ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ ÇİÇEK ÇEŞİTLERİ:SİYAHGÜL VERİM:%84 ORKİDE VERİM:%56");
              JOptionPane.showMessageDialog(frame, "DOĞU ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ TARIM ÜRÜNLERİ: \n ARMUT AĞACI VERİM:% 74 KAYISI AĞACI VERİM:%59 \n ÇAM AĞACI VERİM:%74 \nMERCİMEK VERİM:%59 ÇAVDAR VERİM:%50 \nSİYAHGÜL VERİM:%84 ORKİDE VERİM:%56", "DOĞU ANADOLU BÖLGESİ", JOptionPane.INFORMATION_MESSAGE);
          }
      });
      frame.add(button6);


//******7.BUTON*******
      JButton button7 = new JButton("GÜNEY DOĞU ANADOLU BÖLGESİ");
      button7.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {

              System.out.println("GÜNEY DOĞU ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ MEYVELİ AĞAÇ TÜRLERİ:ANTEPFISTIĞI AĞACI VERİM:%74 PORTAKAL AĞACI VERİM:%69");
              System.out.println("GÜNEY DOĞU ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ MEYVESİZ AĞAÇ TÜRLERİ: KIZILÇAM AĞACI VERİM:%74");
              System.out.println("GÜNEY DOĞU ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ TAHIL ÜRÜNLERİ: PİRİNÇ VERİM:%48 ŞEKER PANCARI VERİM:%19");
              System.out.println("GÜNEY DOĞU ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ ÇİÇEK ÇEŞİTLERİ:SÜSENGÜLÜ VERİM:%84 ÇİÇEK AÇAN ARDIÇ VERİM:%76");
              JOptionPane.showMessageDialog(frame, "GÜNEY DOĞU ANADOLU BÖLGESİ İÇİN EN ÖNEMLİ TARIM ÜRÜNLERİ: \n ANTEPFISTIĞI AĞACI VERİM:% 74- PORTAKAL AĞACI VERİM:%69 \n KIZILÇAM AĞACI VERİM:%74 \n PİRİNÇ VERİM:%48 ŞEKER PANCARI VERİM:%19 \n SÜSENGÜLÜ VERİM:%84- ÇİÇEK AÇAN ARDIÇ VERİM:%76 ", "GÜNEY DOĞU ANADOLU BÖLGESİ", JOptionPane.INFORMATION_MESSAGE);
          }
      });
      frame.add(button7);



      //PENCEREYİ KAPATMAK İÇİN BUTON
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.setVisible(true);
  }
}