/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooii.utfpr.memory_game.View;

import pooii.utfpr.memory_game.Model.VO.factory.SimpleModalityFactory;
import pooii.utfpr.memory_game.Model.VO.modalidades.Difficulty;
import pooii.utfpr.memory_game.Model.VO.modalidades.ModalityEnum;

/**
 *
 * @author Jece Xavier
 */
public class Inicar {
    
    
    public static void main(String[] args) {
        
        Difficulty dif = SimpleModalityFactory.createModality(ModalityEnum.HARD);
        
        TelaPartida tp = new TelaPartida(dif);
        
    }
}