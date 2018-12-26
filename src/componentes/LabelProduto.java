/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import Graphical.DlgMostraProduto;
import core.Produto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Efa
 */
public class LabelProduto extends JLabel{

    private Produto produto;
    
    public LabelProduto(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
    }

    public LabelProduto(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    public LabelProduto(String text) {
        super(text);
    }

    public LabelProduto(Icon image, int horizontalAlignment) {
        super(image, horizontalAlignment);
    }

    public LabelProduto(Icon image) {
        super(image);
    }

    public LabelProduto() {
        super();
    }
    
    public void setProduto(Produto produto){
        if(produto != null){
            this.produto = produto;

            setText(produto.getDescricao());
         
            setHorizontalAlignment(JLabel.CENTER);
            setPreferredSize(new Dimension(100, 100));
            setSize(new Dimension(100, 100));
            setBackground(Color.red);
            
            File fotoFile = new File("fotos/"+produto.getFotografia());
            BufferedImage bImage = null;
            try {
                bImage = ImageIO.read(fotoFile);
                setIcon(new ImageIcon(bImage.getScaledInstance(150, 150, BufferedImage.SCALE_SMOOTH)));
            } catch (IOException | NullPointerException ex) {
               // Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
    public Produto getProduto(){
        return produto;
    }
}
