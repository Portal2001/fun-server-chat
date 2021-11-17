package vb.$funserverchat;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;

	@Override
	public void onEnable() {
		instance = this;
		getDataFolder().mkdir();
		getServer().getPluginManager().registerEvents(this, this);
		try {
			((org.bukkit.command.CommandSender) (Object) org.bukkit.Bukkit.getConsoleSender())
					.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2yo yo plugin is enabled!!!!"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
		try {
			((org.bukkit.command.CommandSender) (Object) org.bukkit.Bukkit.getConsoleSender())
					.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2yo yo plugin isdisabled!!!!"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		return true;
	}

	public static void procedure(String procedure, List procedureArgs) throws Exception {
	}

	public static Object function(String function, List functionArgs) throws Exception {
		return null;
	}

	public static List createList(Object obj) {
		List list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else if (obj instanceof Iterator) {
			((Iterator<?>) obj).forEachRemaining(list::add);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PluginMain getInstance() {
		return instance;
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void onAsyncPlayerChatEvent1(org.bukkit.event.player.AsyncPlayerChatEvent event) throws Exception {
		new org.bukkit.scheduler.BukkitRunnable() {
			public void run() {
				try {
					if (PluginMain.checkEquals(event.getMessage(), "hello")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer())
								.sendMessage(ChatColor.translateAlternateColorCodes('&',
										"&c[server]&2HI...Don't say hello i dont know you..may be owner??"));
					}
					if (PluginMain.checkEquals(event.getMessage(), "come here")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer())
								.sendMessage(ChatColor.translateAlternateColorCodes('&',
										"&c[server]&2Don't you know server dont have legs..you come here are take me"));
					}
					if (PluginMain.checkEquals(event.getMessage(), "i am rich")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer())
								.sendMessage(ChatColor.translateAlternateColorCodes('&',
										"&c[server]&2Hmm some accounts are going to be empty XD.."));
					}
					if (PluginMain.checkEquals(event.getMessage(), "make big farm")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer())
								.sendMessage(ChatColor.translateAlternateColorCodes('&',
										"&c[server]&2Green Green I feel cool 20TPS to all..."));
					}
					if (PluginMain.checkEquals(event.getMessage(), "big mob farm")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer())
								.sendMessage(ChatColor.translateAlternateColorCodes('&',
										"&c[server]&2Don't you dare make that mobs gives stress to me.."));
					}
					if (PluginMain.checkEquals(event.getMessage(), "my dog died")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer())
								.sendMessage(ChatColor.translateAlternateColorCodes('&',
										"&c[server]&2RIP i will remember in my Harddisk..."));
					}
					if (PluginMain.checkEquals(event.getMessage(), "who is online")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer())
								.sendMessage(ChatColor.translateAlternateColorCodes('&',
										"&c[chat]=>&2Server is online thats why you in XD.."));
					}
					if (PluginMain.checkEquals(event.getMessage(), "how to vote")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer())
								.sendMessage(ChatColor.translateAlternateColorCodes('&',
										"&c[chat]=>&2ya ya do /vote i will be the next pm The server..."));
					}
					if (PluginMain.checkEquals(event.getMessage(), "Op sword")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer()).sendMessage(ChatColor
								.translateAlternateColorCodes('&', "&c[chat]=>&2naaaaaa I can do better XD..."));
					}
					if (PluginMain.checkEquals(event.getMessage(), "wtf")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer()).sendMessage(ChatColor
								.translateAlternateColorCodes('&', "&c[chat]=>&2OOO NOOO what happend i am all good"));
					}
					if (PluginMain.checkEquals(event.getMessage(), "jk")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer()).sendMessage(ChatColor
								.translateAlternateColorCodes('&', "&c[chat]=>&2Its not funny i am dieing here.."));
					}
					if (PluginMain.checkEquals(event.getMessage(), "i am back")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer()).sendMessage(
								ChatColor.translateAlternateColorCodes('&', "&c[chat]=>&2WHo asked XD..."));
					}
					if (PluginMain.checkEquals(event.getMessage(), "lol")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer())
								.sendMessage(ChatColor.translateAlternateColorCodes('&',
										"&c[chat]=>&2aaaaw lots of love for me.. but i hate you .."));
					}
					if (PluginMain.checkEquals(event.getMessage(), "fuck off")) {
						((org.bukkit.command.CommandSender) (Object) event.getPlayer()).sendMessage(ChatColor
								.translateAlternateColorCodes('&', "&c[chat]=>&2But i can fuck I have your IP XD.."));
					} else {
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}.runTaskLater(PluginMain.getInstance(), ((long) 20d));
	}

	public static boolean checkEquals(Object o1, Object o2) {
		if (o1 == null || o2 == null) {
			return false;
		}
		return o1 instanceof Number && o2 instanceof Number
				? ((Number) o1).doubleValue() == ((Number) o2).doubleValue()
				: o1.equals(o2);
	}
}
