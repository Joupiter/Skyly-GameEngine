package fr.joupi.api.game.utils;

import fr.joupi.api.game.Game;
import fr.joupi.api.game.host.GameHost;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public final class GameHostBuilder {

    private final GameHost<?> gameHost;

    private GameHostBuilder(Game<?, ?, ?> game, UUID hostUuid) {
        this.gameHost = new GameHost<>(game, hostUuid);
    }

    public static GameHostBuilder of(Game<?, ?, ?> game, UUID hostUuid) {
        return new GameHostBuilder(game, hostUuid);
    }

    public GameHostBuilder withHostItem(ItemStack hostItem) {
        gameHost.setHostItem(hostItem);
        return this;
    }

    public GameHost<?> build() {
        return gameHost;
    }

}