/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battle.of.hero.Controller;

import battle.of.hero.View.*;
import battle.of.hero.Controller.*;
import battle.of.hero.Model.*;
import BattleMain.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class cDeck {

    private Deck vDeck;
//    private mCard mCard;
    private jListCon jList;
    private ArrayList<Card> koleksi;

    DefaultListModel listDeck, listCard;

    public cDeck() throws SQLException {
//        koleksi = mCard.getCollection();
        vDeck = new Deck();
        jList = new jListCon();
        listDeck = new DefaultListModel();
        listCard = new DefaultListModel();
        
        vDeck.setVisible(true);
        vDeck.getBtnAdd().addActionListener(new addList());
        vDeck.getBtnRemove().addActionListener(new removeList());
        vDeck.getListCard().addMouseListener(new cardPrev());
        
        listCard = jList.getCol();
        
        vDeck.getListDeck().setModel(listDeck);
        vDeck.getListCard().setModel(listCard);

//        jList.addFromDatabase(vHeropedia.getCardList());
    }

    private class cardPrev implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println(vDeck.getListCard().getSelectedValue());
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    private class addList implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (vDeck.getListCard().getSelectedIndex() != -1) {
                jList.addItem(listDeck, vDeck.getListCard().getSelectedValue(), listCard, vDeck.getListCard().getSelectedIndex());
            }
//            vDeck.getListDeck().sort
        }
    }

    private class removeList implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (vDeck.getListDeck().getSelectedIndex() != -1) {
                jList.removeItem(listDeck, vDeck.getListDeck().getSelectedIndex(), listCard, vDeck.getListDeck().getSelectedValue());
            }
        }
    }
}
