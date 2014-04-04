package com.lactem.pvz.game;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scoreboard.Scoreboard;

import com.lactem.pvz.farm.Farm;
import com.lactem.pvz.main.Main;
import com.lactem.pvz.row.TempRow;
import com.lactem.pvz.team.plant.PlantTeam;
import com.lactem.pvz.team.zombie.ZombieTeam;

public class Game {
	private int slot;
	private GameState state;
	private ItemStack item;
	private Farm farm;
	private List<String> list = new ArrayList<String>();
	private int maxPlayers;
	private int timeLeft = Main.fileUtils.getConfig().getInt("round length") + 1;
	private int timeUntilStart = Main.fileUtils.getConfig().getInt(
			"time until start") + 1;
	private PlantTeam plants = new PlantTeam();
	private ZombieTeam zombies = new ZombieTeam();
	private Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
	private ArrayList<TempRow> rows = new ArrayList<TempRow>();

	public Game(int slot, GameState state, ItemStack item, List<String> list,
			String farm, int maxPlayers) {
		this.slot = slot;
		this.state = state;
		this.item = item;
		this.list = list;
		this.farm = Main.farmManager.readFarm(farm + ".txt");
		this.maxPlayers = maxPlayers;
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public GameState getState() {
		return state;
	}

	public void setState(GameState state) {
		this.state = state;
	}

	public ItemStack getItem() {
		return item;
	}

	public void setItemStack(ItemStack item) {
		this.item = item;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Farm getFarm() {
		return farm;
	}

	public void setFarm(Farm farm) {
		this.farm = farm;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public int getTimeLeft() {
		return timeLeft;
	}

	public void setTimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}

	public int getTimeUntilStart() {
		return timeUntilStart;
	}

	public void setTimeUntilStart(int timeUntilStart) {
		this.timeUntilStart = timeUntilStart;
	}

	public PlantTeam getPlants() {
		return plants;
	}

	public void setPlants(PlantTeam plants) {
		this.plants = plants;
	}

	public ZombieTeam getZombies() {
		return zombies;
	}

	public void setZombies(ZombieTeam zombies) {
		this.zombies = zombies;
	}

	public ArrayList<TempRow> getRows() {
		return rows;
	}

	public void setRows(ArrayList<TempRow> rows) {
		this.rows = rows;
	}

	public Scoreboard getBoard() {
		return board;
	}

	public void setBoard(Scoreboard board) {
		this.board = board;
	}
}