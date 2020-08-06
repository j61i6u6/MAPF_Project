package MPP;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import MPP.DijkstraAlgorithm;
import MPP.robot;



public class MapBuilder {
	Node nodeA = new Node("A", 0, 0);
	Node nodeB = new Node("B", 0, 1);
	Node nodeC = new Node("C", 0, 2);
	Node nodeD = new Node("D", 0, 3);
	Node nodeE = new Node("E", 0, 4);
	Node nodeF = new Node("F", 1, 0);
	Node nodeG = new Node("G", 1, 1);
	Node nodeH = new Node("H", 1, 2);
	Node nodeI = new Node("I", 1, 3);
	Node nodeJ = new Node("J", 1, 4);
	Node nodeK = new Node("K", 2, 0);
	Node nodeL = new Node("L", 2, 1);
	Node nodeM = new Node("M", 2, 2);
	Node nodeN = new Node("N", 2, 3);
	Node nodeO = new Node("O", 2, 4);
	Node nodeP = new Node("P", 3, 0);
	Node nodeQ = new Node("Q", 3, 1);
	Node nodeR = new Node("R", 3, 2);
	Node nodeS = new Node("S", 3, 3);
	Node nodeT = new Node("T", 3, 4);
	Node nodeU = new Node("U", 4, 0);
	Node nodeV = new Node("V", 4, 1);
	Node nodeW = new Node("W", 4, 2);
	Node nodeX = new Node("X", 4, 3);
	Node nodeY = new Node("Y", 4, 4);
	
	Node nodeAA = new Node("AA", 0, 5);
	Node nodeAB = new Node("AB", 0, 6);
	Node nodeAC = new Node("AC", 0, 7);
	Node nodeAD = new Node("AD", 0, 8);
	Node nodeAE = new Node("AE", 0, 9);
	Node nodeAF = new Node("AF", 1, 5);
	Node nodeAG = new Node("AG", 1, 6);
	Node nodeAH = new Node("AH", 1, 7);
	Node nodeAI = new Node("AI", 1, 8);
	Node nodeAJ = new Node("AJ", 1, 9);
	Node nodeAK = new Node("AK", 2, 5);
	Node nodeAL = new Node("AL", 2, 6);
	Node nodeAM = new Node("AM", 2, 7);
	Node nodeAN = new Node("AN", 2, 8);
	Node nodeAO = new Node("AO", 2, 9);
	Node nodeAP = new Node("AP", 3, 5);
	Node nodeAQ = new Node("AQ", 3, 6);
	Node nodeAR = new Node("AR", 3, 7);
	Node nodeAS = new Node("AS", 3, 8);
	Node nodeAT = new Node("AT", 3, 9);
	Node nodeAU = new Node("AU", 4, 5);
	Node nodeAV = new Node("AV", 4, 6);
	Node nodeAW = new Node("AW", 4, 7);
	Node nodeAX = new Node("AX", 4, 8);
	Node nodeAY = new Node("AY", 4, 9);
	
	Node nodeBA = new Node("BA", 5, 0);
	Node nodeBB = new Node("BB", 5, 1);
	Node nodeBC = new Node("BC", 5, 2);
	Node nodeBD = new Node("BD", 5, 3);
	Node nodeBE = new Node("BE", 5, 4);
	Node nodeBF = new Node("BF", 6, 0);
	Node nodeBG = new Node("BG", 6, 1);
	Node nodeBH = new Node("BH", 6, 2);
	Node nodeBI = new Node("BI", 6, 3);
	Node nodeBJ = new Node("BJ", 6, 4);
	Node nodeBK = new Node("BK", 7, 0);
	Node nodeBL = new Node("BL", 7, 1);
	Node nodeBM = new Node("BM", 7, 2);
	Node nodeBN = new Node("BN", 7, 3);
	Node nodeBO = new Node("BO", 7, 4);
	Node nodeBP = new Node("BP", 8, 0);
	Node nodeBQ = new Node("BQ", 8, 1);
	Node nodeBR = new Node("BR", 8, 2);
	Node nodeBS = new Node("BS", 8, 3);
	Node nodeBT = new Node("BT", 8, 4);
	Node nodeBU = new Node("BU", 9, 0);
	Node nodeBV = new Node("BV", 9, 1);
	Node nodeBW = new Node("BW", 9, 2);
	Node nodeBX = new Node("BX", 9, 3);
	Node nodeBY = new Node("BY", 9, 4);
	
	Node nodeCA = new Node("CA", 5, 5);
	Node nodeCB = new Node("CB", 5, 6);
	Node nodeCC = new Node("CC", 5, 7);
	Node nodeCD = new Node("CD", 5, 8);
	Node nodeCE = new Node("CE", 5, 9);
	Node nodeCF = new Node("CF", 6, 5);
	Node nodeCG = new Node("CG", 6, 6);
	Node nodeCH = new Node("CH", 6, 7);
	Node nodeCI = new Node("CI", 6, 8);
	Node nodeCJ = new Node("CJ", 6, 9);
	Node nodeCK = new Node("CK", 7, 5);
	Node nodeCL = new Node("CL", 7, 6);
	Node nodeCM = new Node("CM", 7, 7);
	Node nodeCN = new Node("CN", 7, 8);
	Node nodeCO = new Node("CO", 7, 9);
	Node nodeCP = new Node("CP", 8, 5);
	Node nodeCQ = new Node("CQ", 8, 6);
	Node nodeCR = new Node("CR", 8, 7);
	Node nodeCS = new Node("CS", 8, 8);
	Node nodeCT = new Node("CT", 8, 9);
	Node nodeCU = new Node("CU", 9, 5);
	Node nodeCV = new Node("CV", 9, 6);
	Node nodeCW = new Node("CW", 9, 7);
	Node nodeCX = new Node("CX", 9, 8);
	Node nodeCY = new Node("CY", 9, 9);
	
	public Graph graph = new Graph();
	
	public void CreateGraph() {
		
		graph.clear();
	
		nodeA = new Node("A", 0, 0);
		nodeB = new Node("B", 0, 1);
		nodeC = new Node("C", 0, 2);
		nodeD = new Node("D", 0, 3);
		nodeE = new Node("E", 0, 4);
		nodeF = new Node("F", 1, 0);
		nodeG = new Node("G", 1, 1);
		nodeH = new Node("H", 1, 2);
		nodeI = new Node("I", 1, 3);
		nodeJ = new Node("J", 1, 4);
		nodeK = new Node("K", 2, 0);
		nodeL = new Node("L", 2, 1);
		nodeM = new Node("M", 2, 2);
		nodeN = new Node("N", 2, 3);
		nodeO = new Node("O", 2, 4);
		nodeP = new Node("P", 3, 0);
		nodeQ = new Node("Q", 3, 1);
		nodeR = new Node("R", 3, 2);
		nodeS = new Node("S", 3, 3);
		nodeT = new Node("T", 3, 4);
		nodeU = new Node("U", 4, 0);
		nodeV = new Node("V", 4, 1);
		nodeW = new Node("W", 4, 2);
		nodeX = new Node("X", 4, 3);
		nodeY = new Node("Y", 4, 4);
		
		nodeAA = new Node("AA", 0, 5);
		nodeAB = new Node("AB", 0, 6);
		nodeAC = new Node("AC", 0, 7);
		nodeAD = new Node("AD", 0, 8);
		nodeAE = new Node("AE", 0, 9);
		nodeAF = new Node("AF", 1, 5);
		nodeAG = new Node("AG", 1, 6);
		nodeAH = new Node("AH", 1, 7);
		nodeAI = new Node("AI", 1, 8);
		nodeAJ = new Node("AJ", 1, 9);
		nodeAK = new Node("AK", 2, 5);
		nodeAL = new Node("AL", 2, 6);
		nodeAM = new Node("AM", 2, 7);
		nodeAN = new Node("AN", 2, 8);
		nodeAO = new Node("AO", 2, 9);
		nodeAP = new Node("AP", 3, 5);
		nodeAQ = new Node("AQ", 3, 6);
		nodeAR = new Node("AR", 3, 7);
		nodeAS = new Node("AS", 3, 8);
		nodeAT = new Node("AT", 3, 9);
		nodeAU = new Node("AU", 4, 5);
		nodeAV = new Node("AV", 4, 6);
		nodeAW = new Node("AW", 4, 7);
		nodeAX = new Node("AX", 4, 8);
		nodeAY = new Node("AY", 4, 9);
		
		nodeBA = new Node("BA", 5, 0);
		nodeBB = new Node("BB", 5, 1);
		nodeBC = new Node("BC", 5, 2);
		nodeBD = new Node("BD", 5, 3);
		nodeBE = new Node("BE", 5, 4);
		nodeBF = new Node("BF", 6, 0);
		nodeBG = new Node("BG", 6, 1);
		nodeBH = new Node("BH", 6, 2);
		nodeBI = new Node("BI", 6, 3);
		nodeBJ = new Node("BJ", 6, 4);
		nodeBK = new Node("BK", 7, 0);
		nodeBL = new Node("BL", 7, 1);
		nodeBM = new Node("BM", 7, 2);
		nodeBN = new Node("BN", 7, 3);
		nodeBO = new Node("BO", 7, 4);
		nodeBP = new Node("BP", 8, 0);
		nodeBQ = new Node("BQ", 8, 1);
		nodeBR = new Node("BR", 8, 2);
		nodeBS = new Node("BS", 8, 3);
		nodeBT = new Node("BT", 8, 4);
		nodeBU = new Node("BU", 9, 0);
		nodeBV = new Node("BV", 9, 1);
		nodeBW = new Node("BW", 9, 2);
		nodeBX = new Node("BX", 9, 3);
		nodeBY = new Node("BY", 9, 4);
		
		nodeCA = new Node("CA", 5, 5);
		nodeCB = new Node("CB", 5, 6);
		nodeCC = new Node("CC", 5, 7);
		nodeCD = new Node("CD", 5, 8);
		nodeCE = new Node("CE", 5, 9);
		nodeCF = new Node("CF", 6, 5);
		nodeCG = new Node("CG", 6, 6);
		nodeCH = new Node("CH", 6, 7);
		nodeCI = new Node("CI", 6, 8);
		nodeCJ = new Node("CJ", 6, 9);
		nodeCK = new Node("CK", 7, 5);
		nodeCL = new Node("CL", 7, 6);
		nodeCM = new Node("CM", 7, 7);
		nodeCN = new Node("CN", 7, 8);
		nodeCO = new Node("CO", 7, 9);
		nodeCP = new Node("CP", 8, 5);
		nodeCQ = new Node("CQ", 8, 6);
		nodeCR = new Node("CR", 8, 7);
		nodeCS = new Node("CS", 8, 8);
		nodeCT = new Node("CT", 8, 9);
		nodeCU = new Node("CU", 9, 5);
		nodeCV = new Node("CV", 9, 6);
		nodeCW = new Node("CW", 9, 7);
		nodeCX = new Node("CX", 9, 8);
		nodeCY = new Node("CY", 9, 9);
		
		
		
		nodeA.addDestination(nodeB, 1);
		nodeA.addDestination(nodeF, 1);
		
		nodeB.addDestination(nodeA, 1);
		nodeB.addDestination(nodeC, 1);
		nodeB.addDestination(nodeG, 1);
		
		nodeC.addDestination(nodeB, 1);
		nodeC.addDestination(nodeD, 1);
		nodeC.addDestination(nodeH, 1);
		
		nodeD.addDestination(nodeC, 1);
		nodeD.addDestination(nodeE, 1);
		nodeD.addDestination(nodeI, 1);
		
		nodeE.addDestination(nodeD, 1);
		nodeE.addDestination(nodeJ, 1);
		nodeE.addDestination(nodeAA, 1);
		
		nodeF.addDestination(nodeA, 1);
		nodeF.addDestination(nodeG, 1);
		nodeF.addDestination(nodeK, 1);
		
		nodeG.addDestination(nodeB, 1);
		nodeG.addDestination(nodeF, 1);
		nodeG.addDestination(nodeL, 1);
		nodeG.addDestination(nodeH, 1);
		
		nodeH.addDestination(nodeC, 1);
		nodeH.addDestination(nodeI, 1);
		nodeH.addDestination(nodeM, 1);
		nodeH.addDestination(nodeG, 1);
		
		nodeI.addDestination(nodeH, 1);
		nodeI.addDestination(nodeD, 1);
		nodeI.addDestination(nodeJ, 1);
		nodeI.addDestination(nodeN, 1);
		
		nodeJ.addDestination(nodeI, 1);
		nodeJ.addDestination(nodeE, 1);
		nodeJ.addDestination(nodeO, 1);
		nodeJ.addDestination(nodeAF, 1);
		
		nodeK.addDestination(nodeF, 1);
		nodeK.addDestination(nodeL, 1);
		nodeK.addDestination(nodeP, 1);
		
		nodeL.addDestination(nodeM, 1);
		nodeL.addDestination(nodeG, 1);
		nodeL.addDestination(nodeQ, 1);
		nodeL.addDestination(nodeK, 1);
		
		nodeM.addDestination(nodeN, 1);
		nodeM.addDestination(nodeH, 1);
		nodeM.addDestination(nodeR, 1);
		nodeM.addDestination(nodeL, 1);
		
		nodeN.addDestination(nodeI, 1);
		nodeN.addDestination(nodeM, 1);
		nodeN.addDestination(nodeO, 1);
		nodeN.addDestination(nodeS, 1);
		
		nodeO.addDestination(nodeJ, 1);
		nodeO.addDestination(nodeN, 1);
		nodeO.addDestination(nodeT, 1);
		nodeO.addDestination(nodeAK, 1);
		
		nodeP.addDestination(nodeK, 1);
		nodeP.addDestination(nodeQ, 1);
		nodeP.addDestination(nodeU, 1);
		
		nodeQ.addDestination(nodeR, 1);
		nodeQ.addDestination(nodeP, 1);
		nodeQ.addDestination(nodeV, 1);
		nodeQ.addDestination(nodeL, 1);
		
		nodeR.addDestination(nodeS, 1);
		nodeR.addDestination(nodeM, 1);
		nodeR.addDestination(nodeQ, 1);
		nodeR.addDestination(nodeW, 1);
		
		nodeS.addDestination(nodeR, 1);
		nodeS.addDestination(nodeN, 1);
		nodeS.addDestination(nodeT, 1);
		nodeS.addDestination(nodeX, 1);
		
		nodeT.addDestination(nodeO, 1);
		nodeT.addDestination(nodeS, 1);
		nodeT.addDestination(nodeY, 1);
		nodeT.addDestination(nodeAP, 1);
		
		nodeU.addDestination(nodeP, 1);
		nodeU.addDestination(nodeV, 1);
		nodeU.addDestination(nodeBA, 1);
		
		nodeV.addDestination(nodeU, 1);
		nodeV.addDestination(nodeQ, 1);
		nodeV.addDestination(nodeW, 1);
		nodeV.addDestination(nodeBB, 1);
		
		nodeW.addDestination(nodeV, 1);
		nodeW.addDestination(nodeX, 1);
		nodeW.addDestination(nodeR, 1);
		nodeW.addDestination(nodeBC, 1);
		
		nodeX.addDestination(nodeW, 1);
		nodeX.addDestination(nodeS, 1);
		nodeX.addDestination(nodeY, 1);
		nodeX.addDestination(nodeBD, 1);
		
		nodeY.addDestination(nodeX, 1);
		nodeY.addDestination(nodeT, 1);
		nodeY.addDestination(nodeAU, 1);
		nodeY.addDestination(nodeBE, 1);
		
		nodeAA.addDestination(nodeE, 1);
		nodeAA.addDestination(nodeAF, 1);
		nodeAA.addDestination(nodeAB, 1);
		
		nodeAB.addDestination(nodeAA, 1);
		nodeAB.addDestination(nodeAC, 1);
		nodeAB.addDestination(nodeAG, 1);
		
		nodeAC.addDestination(nodeAB, 1);
		nodeAC.addDestination(nodeAH, 1);
		nodeAC.addDestination(nodeAD, 1);
		
		nodeAD.addDestination(nodeAC, 1);
		nodeAD.addDestination(nodeAE, 1);
		nodeAD.addDestination(nodeAI, 1);
		
		nodeAE.addDestination(nodeAD, 1);
		nodeAE.addDestination(nodeAJ, 1);
		
		nodeAF.addDestination(nodeAA, 1);
		nodeAF.addDestination(nodeJ, 1);
		nodeAF.addDestination(nodeAG, 1);
		nodeAF.addDestination(nodeAK, 1);
		
		nodeAG.addDestination(nodeAB, 1);
		nodeAG.addDestination(nodeAF, 1);
		nodeAG.addDestination(nodeAH, 1);
		nodeAG.addDestination(nodeAL, 1);
		
		nodeAH.addDestination(nodeAC, 1);
		nodeAH.addDestination(nodeAG, 1);
		nodeAH.addDestination(nodeAI, 1);
		nodeAH.addDestination(nodeAM, 1);
		
		nodeAI.addDestination(nodeAD, 1);
		nodeAI.addDestination(nodeAH, 1);
		nodeAI.addDestination(nodeAJ, 1);
		nodeAI.addDestination(nodeAN, 1);
		
		nodeAJ.addDestination(nodeAE, 1);
		nodeAJ.addDestination(nodeAI, 1);
		nodeAJ.addDestination(nodeAO, 1);

		nodeAK.addDestination(nodeAF, 1);
		nodeAK.addDestination(nodeO, 1);
		nodeAK.addDestination(nodeAL, 1);
		nodeAK.addDestination(nodeAP, 1);
		
		nodeAL.addDestination(nodeAG, 1);
		nodeAL.addDestination(nodeAK, 1);
		nodeAL.addDestination(nodeAM, 1);
		nodeAL.addDestination(nodeAQ, 1);
		
		nodeAM.addDestination(nodeAH, 1);
		nodeAM.addDestination(nodeAL, 1);
		nodeAM.addDestination(nodeAN, 1);
		nodeAM.addDestination(nodeAR, 1);
		
		nodeAN.addDestination(nodeAI, 1);
		nodeAN.addDestination(nodeAM, 1);
		nodeAN.addDestination(nodeAO, 1);
		nodeAN.addDestination(nodeAS, 1);
		
		nodeAO.addDestination(nodeAJ, 1);
		nodeAO.addDestination(nodeAN, 1);
		nodeAO.addDestination(nodeAT, 1);

		nodeAP.addDestination(nodeAK, 1);
		nodeAP.addDestination(nodeT, 1);
		nodeAP.addDestination(nodeAQ, 1);
		nodeAP.addDestination(nodeAU, 1);
		
		nodeAQ.addDestination(nodeAL, 1);
		nodeAQ.addDestination(nodeAP, 1);
		nodeAQ.addDestination(nodeAR, 1);
		nodeAQ.addDestination(nodeAV, 1);
		
		nodeAR.addDestination(nodeAM, 1);
		nodeAR.addDestination(nodeAQ, 1);
		nodeAR.addDestination(nodeAS, 1);
		nodeAR.addDestination(nodeAW, 1);
		
		nodeAS.addDestination(nodeAN, 1);
		nodeAS.addDestination(nodeAR, 1);
		nodeAS.addDestination(nodeAT, 1);
		nodeAS.addDestination(nodeAX, 1);
		
		nodeAT.addDestination(nodeAO, 1);
		nodeAT.addDestination(nodeAS, 1);
		nodeAT.addDestination(nodeAY, 1);
		
		nodeAU.addDestination(nodeAP, 1);
		nodeAU.addDestination(nodeY, 1);
		nodeAU.addDestination(nodeAV, 1);
		nodeAU.addDestination(nodeCA, 1);
		
		nodeAV.addDestination(nodeAQ, 1);
		nodeAV.addDestination(nodeAU, 1);
		nodeAV.addDestination(nodeAW, 1);
		nodeAV.addDestination(nodeCB, 1);
		
		nodeAW.addDestination(nodeAR, 1);
		nodeAW.addDestination(nodeAV, 1);
		nodeAW.addDestination(nodeAX, 1);
		nodeAW.addDestination(nodeCC, 1);
		
		nodeAX.addDestination(nodeAS, 1);
		nodeAX.addDestination(nodeAW, 1);
		nodeAX.addDestination(nodeAY, 1);
		nodeAX.addDestination(nodeCD, 1);
		
		nodeAY.addDestination(nodeAT, 1);
		nodeAY.addDestination(nodeAX, 1);
		nodeAY.addDestination(nodeCE, 1);
		
		nodeBA.addDestination(nodeU, 1);
		nodeBA.addDestination(nodeBB, 1);
		nodeBA.addDestination(nodeBF, 1);
		
		nodeBB.addDestination(nodeV, 1);
		nodeBB.addDestination(nodeBA, 1);
		nodeBB.addDestination(nodeBC, 1);
		nodeBB.addDestination(nodeBG, 1);
		
		nodeBC.addDestination(nodeW, 1);
		nodeBC.addDestination(nodeBB, 1);
		nodeBC.addDestination(nodeBD, 1);
		nodeBC.addDestination(nodeBH, 1);
		
		nodeBD.addDestination(nodeX, 1);
		nodeBD.addDestination(nodeBC, 1);
		nodeBD.addDestination(nodeBE, 1);
		nodeBD.addDestination(nodeBI, 1);
		
		nodeBE.addDestination(nodeY, 1);
		nodeBE.addDestination(nodeBD, 1);
		nodeBE.addDestination(nodeCA, 1);
		nodeBE.addDestination(nodeBJ, 1);
		
		nodeBF.addDestination(nodeBA, 1);
		nodeBF.addDestination(nodeBG, 1);
		nodeBF.addDestination(nodeBK, 1);
		
		nodeBG.addDestination(nodeBB, 1);
		nodeBG.addDestination(nodeBF, 1);
		nodeBG.addDestination(nodeBH, 1);
		nodeBG.addDestination(nodeBL, 1);
		
		nodeBH.addDestination(nodeBC, 1);
		nodeBH.addDestination(nodeBG, 1);
		nodeBH.addDestination(nodeBI, 1);
		nodeBH.addDestination(nodeBM, 1);
		
		nodeBI.addDestination(nodeBD, 1);
		nodeBI.addDestination(nodeBH, 1);
		nodeBI.addDestination(nodeBJ, 1);
		nodeBI.addDestination(nodeBN, 1);
		
		nodeBJ.addDestination(nodeBE, 1);
		nodeBJ.addDestination(nodeBI, 1);
		nodeBJ.addDestination(nodeCF, 1);
		nodeBJ.addDestination(nodeBO, 1);
		
		nodeBK.addDestination(nodeBF, 1);
		nodeBK.addDestination(nodeBL, 1);
		nodeBK.addDestination(nodeBP, 1);

		nodeBL.addDestination(nodeBG, 1);
		nodeBL.addDestination(nodeBK, 1);
		nodeBL.addDestination(nodeBM, 1);
		nodeBL.addDestination(nodeBQ, 1);
		
		nodeBM.addDestination(nodeBH, 1);
		nodeBM.addDestination(nodeBL, 1);
		nodeBM.addDestination(nodeBN, 1);
		nodeBM.addDestination(nodeBR, 1);
		
		nodeBN.addDestination(nodeBI, 1);
		nodeBN.addDestination(nodeBM, 1);
		nodeBN.addDestination(nodeBO, 1);
		nodeBN.addDestination(nodeBS, 1);
		
		nodeBO.addDestination(nodeBJ, 1);
		nodeBO.addDestination(nodeBN, 1);
		nodeBO.addDestination(nodeCK, 1);
		nodeBO.addDestination(nodeBT, 1);
		
		nodeBP.addDestination(nodeBK, 1);
		nodeBP.addDestination(nodeBQ, 1);
		nodeBP.addDestination(nodeBU, 1);

		nodeBQ.addDestination(nodeBL, 1);
		nodeBQ.addDestination(nodeBP, 1);
		nodeBQ.addDestination(nodeBR, 1);
		nodeBQ.addDestination(nodeBV, 1);
		
		nodeBR.addDestination(nodeBM, 1);
		nodeBR.addDestination(nodeBQ, 1);
		nodeBR.addDestination(nodeBS, 1);
		nodeBR.addDestination(nodeBW, 1);
		
		nodeBS.addDestination(nodeBN, 1);
		nodeBS.addDestination(nodeBR, 1);
		nodeBS.addDestination(nodeBT, 1);
		nodeBS.addDestination(nodeBX, 1);
		
		nodeBT.addDestination(nodeBO, 1);
		nodeBT.addDestination(nodeBS, 1);
		nodeBT.addDestination(nodeCP, 1);
		nodeBT.addDestination(nodeBY, 1);
		
		nodeBU.addDestination(nodeBP, 1);
		nodeBU.addDestination(nodeBV, 1);
		
		nodeBV.addDestination(nodeBQ, 1);
		nodeBV.addDestination(nodeBU, 1);
		nodeBV.addDestination(nodeBW, 1);
		
		nodeBW.addDestination(nodeBR, 1);
		nodeBW.addDestination(nodeBV, 1);
		nodeBW.addDestination(nodeBX, 1);
		
		nodeBX.addDestination(nodeBS, 1);
		nodeBX.addDestination(nodeBW, 1);
		nodeBX.addDestination(nodeBY, 1);
		
		nodeBY.addDestination(nodeBT, 1);
		nodeBY.addDestination(nodeBX, 1);
		nodeBY.addDestination(nodeCU, 1);
		
		nodeCA.addDestination(nodeAU, 1);
		nodeCA.addDestination(nodeBE, 1);
		nodeCA.addDestination(nodeCB, 1);
		nodeCA.addDestination(nodeCF, 1);
		
		nodeCB.addDestination(nodeAV, 1);
		nodeCB.addDestination(nodeCA, 1);
		nodeCB.addDestination(nodeCC, 1);
		nodeCB.addDestination(nodeCG, 1);
		
		nodeCC.addDestination(nodeAW, 1);
		nodeCC.addDestination(nodeCB, 1);
		nodeCC.addDestination(nodeCD, 1);
		nodeCC.addDestination(nodeCH, 1);
		
		nodeCD.addDestination(nodeAX, 1);
		nodeCD.addDestination(nodeCC, 1);
		nodeCD.addDestination(nodeCE, 1);
		nodeCD.addDestination(nodeCI, 1);
		
		nodeCE.addDestination(nodeAY, 1);
		nodeCE.addDestination(nodeCD, 1);
		nodeCE.addDestination(nodeCJ, 1);
		
		nodeCF.addDestination(nodeCA, 1);
		nodeCF.addDestination(nodeBJ, 1);
		nodeCF.addDestination(nodeCG, 1);
		nodeCF.addDestination(nodeCK, 1);
		
		nodeCG.addDestination(nodeCB, 1);
		nodeCG.addDestination(nodeCF, 1);
		nodeCG.addDestination(nodeCH, 1);
		nodeCG.addDestination(nodeCL, 1);
		
		nodeCH.addDestination(nodeCC, 1);
		nodeCH.addDestination(nodeCG, 1);
		nodeCH.addDestination(nodeCI, 1);
		nodeCH.addDestination(nodeCM, 1);
		
		nodeCI.addDestination(nodeCD, 1);
		nodeCI.addDestination(nodeCH, 1);
		nodeCI.addDestination(nodeCJ, 1);
		nodeCI.addDestination(nodeCN, 1);
		
		nodeCJ.addDestination(nodeCE, 1);
		nodeCJ.addDestination(nodeCI, 1);
		nodeCJ.addDestination(nodeCO, 1);
		
		nodeCK.addDestination(nodeCF, 1);
		nodeCK.addDestination(nodeBO, 1);
		nodeCK.addDestination(nodeCL, 1);
		nodeCK.addDestination(nodeCP, 1);
		
		nodeCL.addDestination(nodeCG, 1);
		nodeCL.addDestination(nodeCK, 1);
		nodeCL.addDestination(nodeCM, 1);
		nodeCL.addDestination(nodeCQ, 1);
		
		nodeCM.addDestination(nodeCH, 1);
		nodeCM.addDestination(nodeCL, 1);
		nodeCM.addDestination(nodeCN, 1);
		nodeCM.addDestination(nodeCR, 1);
		
		nodeCN.addDestination(nodeCI, 1);
		nodeCN.addDestination(nodeCM, 1);
		nodeCN.addDestination(nodeCO, 1);
		nodeCN.addDestination(nodeCS, 1);
		
		nodeCO.addDestination(nodeCJ, 1);
		nodeCO.addDestination(nodeCN, 1);
		nodeCO.addDestination(nodeCT, 1);
		
		nodeCP.addDestination(nodeCK, 1);
		nodeCP.addDestination(nodeBT, 1);
		nodeCP.addDestination(nodeCQ, 1);
		nodeCP.addDestination(nodeCU, 1);
		
		nodeCQ.addDestination(nodeCL, 1);
		nodeCQ.addDestination(nodeCP, 1);
		nodeCQ.addDestination(nodeCR, 1);
		nodeCQ.addDestination(nodeCV, 1);
		
		nodeCR.addDestination(nodeCM, 1);
		nodeCR.addDestination(nodeCQ, 1);
		nodeCR.addDestination(nodeCS, 1);
		nodeCR.addDestination(nodeCW, 1);
		
		nodeCS.addDestination(nodeCN, 1);
		nodeCS.addDestination(nodeCR, 1);
		nodeCS.addDestination(nodeCT, 1);
		nodeCS.addDestination(nodeCX, 1);
		
		nodeCT.addDestination(nodeCO, 1);
		nodeCT.addDestination(nodeCS, 1);
		nodeCT.addDestination(nodeCY, 1);
		
		nodeCU.addDestination(nodeCP, 1);
		nodeCU.addDestination(nodeBY, 1);
		nodeCU.addDestination(nodeCV, 1);
		
		nodeCV.addDestination(nodeCQ, 1);
		nodeCV.addDestination(nodeCU, 1);
		nodeCV.addDestination(nodeCW, 1);
		
		nodeCW.addDestination(nodeCR, 1);
		nodeCW.addDestination(nodeCV, 1);
		nodeCW.addDestination(nodeCX, 1);
		
		nodeCX.addDestination(nodeCS, 1);
		nodeCX.addDestination(nodeCW, 1);
		nodeCX.addDestination(nodeCY, 1);
		
		nodeCY.addDestination(nodeCT, 1);
		nodeCY.addDestination(nodeCX, 1);
		
		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);
		graph.addNode(nodeG);
		graph.addNode(nodeH);
		graph.addNode(nodeI);
		graph.addNode(nodeJ);
		graph.addNode(nodeK);
		graph.addNode(nodeL);
		graph.addNode(nodeM);
		graph.addNode(nodeN);
		graph.addNode(nodeO);
		graph.addNode(nodeP);
		graph.addNode(nodeQ);
		graph.addNode(nodeR);
		graph.addNode(nodeS);
		graph.addNode(nodeT);
		graph.addNode(nodeU);
		graph.addNode(nodeV);
		graph.addNode(nodeW);
		graph.addNode(nodeX);
		graph.addNode(nodeY);
		graph.addNode(nodeAA);
		graph.addNode(nodeAB);
		graph.addNode(nodeAC);
		graph.addNode(nodeAD);
		graph.addNode(nodeAE);
		graph.addNode(nodeAF);
		graph.addNode(nodeAG);
		graph.addNode(nodeAH);
		graph.addNode(nodeAI);
		graph.addNode(nodeAJ);
		graph.addNode(nodeAK);
		graph.addNode(nodeAL);
		graph.addNode(nodeAM);
		graph.addNode(nodeAN);
		graph.addNode(nodeAO);
		graph.addNode(nodeAP);
		graph.addNode(nodeAQ);
		graph.addNode(nodeAR);
		graph.addNode(nodeAS);
		graph.addNode(nodeAT);
		graph.addNode(nodeAU);
		graph.addNode(nodeAV);
		graph.addNode(nodeAW);
		graph.addNode(nodeAX);
		graph.addNode(nodeAY);
		graph.addNode(nodeBA);
		graph.addNode(nodeBB);
		graph.addNode(nodeBC);
		graph.addNode(nodeBD);
		graph.addNode(nodeBE);
		graph.addNode(nodeBF);
		graph.addNode(nodeBG);
		graph.addNode(nodeBH);
		graph.addNode(nodeBI);
		graph.addNode(nodeBJ);
		graph.addNode(nodeBK);
		graph.addNode(nodeBL);
		graph.addNode(nodeBM);
		graph.addNode(nodeBN);
		graph.addNode(nodeBO);
		graph.addNode(nodeBP);
		graph.addNode(nodeBQ);
		graph.addNode(nodeBR);
		graph.addNode(nodeBS);
		graph.addNode(nodeBT);
		graph.addNode(nodeBU);
		graph.addNode(nodeBV);
		graph.addNode(nodeBW);
		graph.addNode(nodeBX);
		graph.addNode(nodeBY);
		graph.addNode(nodeCA);
		graph.addNode(nodeCB);
		graph.addNode(nodeCC);
		graph.addNode(nodeCD);
		graph.addNode(nodeCE);
		graph.addNode(nodeCF);
		graph.addNode(nodeCG);
		graph.addNode(nodeCH);
		graph.addNode(nodeCI);
		graph.addNode(nodeCJ);
		graph.addNode(nodeCK);
		graph.addNode(nodeCL);
		graph.addNode(nodeCM);
		graph.addNode(nodeCN);
		graph.addNode(nodeCO);
		graph.addNode(nodeCP);
		graph.addNode(nodeCQ);
		graph.addNode(nodeCR);
		graph.addNode(nodeCS);
		graph.addNode(nodeCT);
		graph.addNode(nodeCU);
		graph.addNode(nodeCV);
		graph.addNode(nodeCW);
		graph.addNode(nodeCX);
		graph.addNode(nodeCY);
		

	}
	
	public void AddObstacle(Node obs)
	{
		graph.delNode(obs);
		ArrayList adj = new ArrayList();
		for(Node x:obs.getAdjacentNodes().keySet())
		{
			adj.add(x);
			x.delDestination(obs);
		}
		for(int i=0;i<adj.size();i++)
		{
			obs.delDestination((Node)adj.get(i));
		}
	}
	
	public ArrayList<ArrayList> New_getShortestPathToDestination(Graph map,Node source,Node destination,int r)
	{
		DijkstraAlgorithm da = new DijkstraAlgorithm();
		Graph graph = da.calculateShortestPathFromSource(map, source);
		
		ArrayList<ArrayList> RobotPath = new ArrayList<ArrayList>();
		String shortestPath = "";
		
		for (Node myVal : graph.getNodes()) {
			if (myVal.getName() == destination.getName()) {
				shortestPath = source.getName() + " to " + myVal.getName() + " is " + myVal.getDistance() + " ";
				
				for(int i = 0; i <myVal.getShortestPath().size(); i++) {
					List<Node> listNode =  myVal.getShortestPath();
					Node node = listNode.get(i);	
					ArrayList R_pos = new ArrayList();
					R_pos.add(node);
					R_pos.add(i+r);
					RobotPath.add(R_pos);
				}
				ArrayList R_pos = new ArrayList();
				R_pos.add(myVal);
				R_pos.add(myVal.getShortestPath().size()+r);
				
				RobotPath.add(R_pos);	
			}
			}		
		return RobotPath;
	}
	
	
	
	
}

