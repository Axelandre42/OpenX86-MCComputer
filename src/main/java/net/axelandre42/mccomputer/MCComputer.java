package net.axelandre42.mccomputer;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import net.axelandre42.mccomputer.common.CommonProxy;

@Mod(modid = MCComputer.MODID, name = MCComputer.MODID, version = "0.01")
public class MCComputer {
	public static final String MODID = "OpenX86-MCComputer";
	
	@Mod.Instance(value = MODID)
	public static MCComputer instance;
	
	@SidedProxy(clientSide = "net.axelandre42.mccomputer.client.ClientProxy", serverSide = "net.axelandre42.mccomputer.server.ServerProxy")
	public static CommonProxy proxy;
	
}
