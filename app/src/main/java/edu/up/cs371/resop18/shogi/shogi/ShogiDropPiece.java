package edu.up.cs371.resop18.shogi.shogi;

import edu.up.cs371.resop18.shogi.game.GamePlayer;
import edu.up.cs371.resop18.shogi.game.actionMsg.GameAction;

/**
 * @author Javier Resop
 */

public class ShogiDropPiece extends GameAction {
    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public ShogiDropPiece(GamePlayer player) {
        super(player);
    }
}
