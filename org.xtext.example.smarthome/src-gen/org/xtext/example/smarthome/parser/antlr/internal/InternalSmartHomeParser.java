package org.xtext.example.smarthome.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.smarthome.services.SmartHomeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmartHomeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SmartHomeController'", "':'", "'Room'", "'where'", "'properties:'", "'room'", "'inheritance:'", "'extends'", "'from'", "'device'", "'Device'", "'Actions:'", "'constraints:'", "'do'", "'AND'", "'>'", "'<'", "'('", "')'", "'bool'", "'integer'", "'double'", "'string'", "'private'", "'public'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmartHomeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmartHomeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmartHomeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmartHome.g"; }



     	private SmartHomeGrammarAccess grammarAccess;

        public InternalSmartHomeParser(TokenStream input, SmartHomeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Controller";
       	}

       	@Override
       	protected SmartHomeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleController"
    // InternalSmartHome.g:64:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalSmartHome.g:64:51: (iv_ruleController= ruleController EOF )
            // InternalSmartHome.g:65:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalSmartHome.g:71:1: ruleController returns [EObject current=null] : (otherlv_0= 'SmartHomeController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_rooms_3_0= ruleRoom ) )* ( (lv_roomInheritance_4_0= ruleRoomInheritance ) )? ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_rooms_3_0 = null;

        EObject lv_roomInheritance_4_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:77:2: ( (otherlv_0= 'SmartHomeController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_rooms_3_0= ruleRoom ) )* ( (lv_roomInheritance_4_0= ruleRoomInheritance ) )? ) )
            // InternalSmartHome.g:78:2: (otherlv_0= 'SmartHomeController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_rooms_3_0= ruleRoom ) )* ( (lv_roomInheritance_4_0= ruleRoomInheritance ) )? )
            {
            // InternalSmartHome.g:78:2: (otherlv_0= 'SmartHomeController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_rooms_3_0= ruleRoom ) )* ( (lv_roomInheritance_4_0= ruleRoomInheritance ) )? )
            // InternalSmartHome.g:79:3: otherlv_0= 'SmartHomeController' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_rooms_3_0= ruleRoom ) )* ( (lv_roomInheritance_4_0= ruleRoomInheritance ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getSmartHomeControllerKeyword_0());
            		
            // InternalSmartHome.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartHome.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartHome.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalSmartHome.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getColonKeyword_2());
            		
            // InternalSmartHome.g:105:3: ( (lv_rooms_3_0= ruleRoom ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmartHome.g:106:4: (lv_rooms_3_0= ruleRoom )
            	    {
            	    // InternalSmartHome.g:106:4: (lv_rooms_3_0= ruleRoom )
            	    // InternalSmartHome.g:107:5: lv_rooms_3_0= ruleRoom
            	    {

            	    					newCompositeNode(grammarAccess.getControllerAccess().getRoomsRoomParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_rooms_3_0=ruleRoom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getControllerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rooms",
            	    						lv_rooms_3_0,
            	    						"org.xtext.example.smarthome.SmartHome.Room");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSmartHome.g:124:3: ( (lv_roomInheritance_4_0= ruleRoomInheritance ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmartHome.g:125:4: (lv_roomInheritance_4_0= ruleRoomInheritance )
                    {
                    // InternalSmartHome.g:125:4: (lv_roomInheritance_4_0= ruleRoomInheritance )
                    // InternalSmartHome.g:126:5: lv_roomInheritance_4_0= ruleRoomInheritance
                    {

                    					newCompositeNode(grammarAccess.getControllerAccess().getRoomInheritanceRoomInheritanceParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_roomInheritance_4_0=ruleRoomInheritance();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getControllerRule());
                    					}
                    					set(
                    						current,
                    						"roomInheritance",
                    						lv_roomInheritance_4_0,
                    						"org.xtext.example.smarthome.SmartHome.RoomInheritance");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleRoom"
    // InternalSmartHome.g:147:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalSmartHome.g:147:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalSmartHome.g:148:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalSmartHome.g:154:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'where' otherlv_3= 'properties:' ( (lv_properties_4_0= ruleProperty ) )* ( (lv_devices_5_0= ruleDevice ) )* ( (lv_deviceInheritance_6_0= ruleDeviceInheritance ) )? ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_properties_4_0 = null;

        EObject lv_devices_5_0 = null;

        EObject lv_deviceInheritance_6_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:160:2: ( (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'where' otherlv_3= 'properties:' ( (lv_properties_4_0= ruleProperty ) )* ( (lv_devices_5_0= ruleDevice ) )* ( (lv_deviceInheritance_6_0= ruleDeviceInheritance ) )? ) )
            // InternalSmartHome.g:161:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'where' otherlv_3= 'properties:' ( (lv_properties_4_0= ruleProperty ) )* ( (lv_devices_5_0= ruleDevice ) )* ( (lv_deviceInheritance_6_0= ruleDeviceInheritance ) )? )
            {
            // InternalSmartHome.g:161:2: (otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'where' otherlv_3= 'properties:' ( (lv_properties_4_0= ruleProperty ) )* ( (lv_devices_5_0= ruleDevice ) )* ( (lv_deviceInheritance_6_0= ruleDeviceInheritance ) )? )
            // InternalSmartHome.g:162:3: otherlv_0= 'Room' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'where' otherlv_3= 'properties:' ( (lv_properties_4_0= ruleProperty ) )* ( (lv_devices_5_0= ruleDevice ) )* ( (lv_deviceInheritance_6_0= ruleDeviceInheritance ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalSmartHome.g:166:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartHome.g:167:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartHome.g:167:4: (lv_name_1_0= RULE_ID )
            // InternalSmartHome.g:168:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoomAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getWhereKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getPropertiesKeyword_3());
            		
            // InternalSmartHome.g:192:3: ( (lv_properties_4_0= ruleProperty ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=34 && LA3_0<=35)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmartHome.g:193:4: (lv_properties_4_0= ruleProperty )
            	    {
            	    // InternalSmartHome.g:193:4: (lv_properties_4_0= ruleProperty )
            	    // InternalSmartHome.g:194:5: lv_properties_4_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getRoomAccess().getPropertiesPropertyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_properties_4_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoomRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_4_0,
            	    						"org.xtext.example.smarthome.SmartHome.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSmartHome.g:211:3: ( (lv_devices_5_0= ruleDevice ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmartHome.g:212:4: (lv_devices_5_0= ruleDevice )
            	    {
            	    // InternalSmartHome.g:212:4: (lv_devices_5_0= ruleDevice )
            	    // InternalSmartHome.g:213:5: lv_devices_5_0= ruleDevice
            	    {

            	    					newCompositeNode(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_devices_5_0=ruleDevice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoomRule());
            	    					}
            	    					add(
            	    						current,
            	    						"devices",
            	    						lv_devices_5_0,
            	    						"org.xtext.example.smarthome.SmartHome.Device");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSmartHome.g:230:3: ( (lv_deviceInheritance_6_0= ruleDeviceInheritance ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmartHome.g:231:4: (lv_deviceInheritance_6_0= ruleDeviceInheritance )
                    {
                    // InternalSmartHome.g:231:4: (lv_deviceInheritance_6_0= ruleDeviceInheritance )
                    // InternalSmartHome.g:232:5: lv_deviceInheritance_6_0= ruleDeviceInheritance
                    {

                    					newCompositeNode(grammarAccess.getRoomAccess().getDeviceInheritanceDeviceInheritanceParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_deviceInheritance_6_0=ruleDeviceInheritance();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRoomRule());
                    					}
                    					set(
                    						current,
                    						"deviceInheritance",
                    						lv_deviceInheritance_6_0,
                    						"org.xtext.example.smarthome.SmartHome.DeviceInheritance");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleRoomInheritance"
    // InternalSmartHome.g:253:1: entryRuleRoomInheritance returns [EObject current=null] : iv_ruleRoomInheritance= ruleRoomInheritance EOF ;
    public final EObject entryRuleRoomInheritance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomInheritance = null;


        try {
            // InternalSmartHome.g:253:56: (iv_ruleRoomInheritance= ruleRoomInheritance EOF )
            // InternalSmartHome.g:254:2: iv_ruleRoomInheritance= ruleRoomInheritance EOF
            {
             newCompositeNode(grammarAccess.getRoomInheritanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoomInheritance=ruleRoomInheritance();

            state._fsp--;

             current =iv_ruleRoomInheritance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoomInheritance"


    // $ANTLR start "ruleRoomInheritance"
    // InternalSmartHome.g:260:1: ruleRoomInheritance returns [EObject current=null] : (otherlv_0= 'room' otherlv_1= 'inheritance:' ( (lv_inheritances_2_0= ruleRoomInheritanceDetails ) )* ) ;
    public final EObject ruleRoomInheritance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_inheritances_2_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:266:2: ( (otherlv_0= 'room' otherlv_1= 'inheritance:' ( (lv_inheritances_2_0= ruleRoomInheritanceDetails ) )* ) )
            // InternalSmartHome.g:267:2: (otherlv_0= 'room' otherlv_1= 'inheritance:' ( (lv_inheritances_2_0= ruleRoomInheritanceDetails ) )* )
            {
            // InternalSmartHome.g:267:2: (otherlv_0= 'room' otherlv_1= 'inheritance:' ( (lv_inheritances_2_0= ruleRoomInheritanceDetails ) )* )
            // InternalSmartHome.g:268:3: otherlv_0= 'room' otherlv_1= 'inheritance:' ( (lv_inheritances_2_0= ruleRoomInheritanceDetails ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomInheritanceAccess().getRoomKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomInheritanceAccess().getInheritanceKeyword_1());
            		
            // InternalSmartHome.g:276:3: ( (lv_inheritances_2_0= ruleRoomInheritanceDetails ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmartHome.g:277:4: (lv_inheritances_2_0= ruleRoomInheritanceDetails )
            	    {
            	    // InternalSmartHome.g:277:4: (lv_inheritances_2_0= ruleRoomInheritanceDetails )
            	    // InternalSmartHome.g:278:5: lv_inheritances_2_0= ruleRoomInheritanceDetails
            	    {

            	    					newCompositeNode(grammarAccess.getRoomInheritanceAccess().getInheritancesRoomInheritanceDetailsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_inheritances_2_0=ruleRoomInheritanceDetails();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRoomInheritanceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inheritances",
            	    						lv_inheritances_2_0,
            	    						"org.xtext.example.smarthome.SmartHome.RoomInheritanceDetails");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoomInheritance"


    // $ANTLR start "entryRuleRoomInheritanceDetails"
    // InternalSmartHome.g:299:1: entryRuleRoomInheritanceDetails returns [EObject current=null] : iv_ruleRoomInheritanceDetails= ruleRoomInheritanceDetails EOF ;
    public final EObject entryRuleRoomInheritanceDetails() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoomInheritanceDetails = null;


        try {
            // InternalSmartHome.g:299:63: (iv_ruleRoomInheritanceDetails= ruleRoomInheritanceDetails EOF )
            // InternalSmartHome.g:300:2: iv_ruleRoomInheritanceDetails= ruleRoomInheritanceDetails EOF
            {
             newCompositeNode(grammarAccess.getRoomInheritanceDetailsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoomInheritanceDetails=ruleRoomInheritanceDetails();

            state._fsp--;

             current =iv_ruleRoomInheritanceDetails; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoomInheritanceDetails"


    // $ANTLR start "ruleRoomInheritanceDetails"
    // InternalSmartHome.g:306:1: ruleRoomInheritanceDetails returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleRoomInheritanceDetails() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmartHome.g:312:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSmartHome.g:313:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSmartHome.g:313:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )
            // InternalSmartHome.g:314:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) )
            {
            // InternalSmartHome.g:314:3: ( (otherlv_0= RULE_ID ) )
            // InternalSmartHome.g:315:4: (otherlv_0= RULE_ID )
            {
            // InternalSmartHome.g:315:4: (otherlv_0= RULE_ID )
            // InternalSmartHome.g:316:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomInheritanceDetailsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getRoomInheritanceDetailsAccess().getRoomChildRoomCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomInheritanceDetailsAccess().getExtendsKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomInheritanceDetailsAccess().getFromKeyword_2());
            		
            // InternalSmartHome.g:335:3: ( (otherlv_3= RULE_ID ) )
            // InternalSmartHome.g:336:4: (otherlv_3= RULE_ID )
            {
            // InternalSmartHome.g:336:4: (otherlv_3= RULE_ID )
            // InternalSmartHome.g:337:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomInheritanceDetailsRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getRoomInheritanceDetailsAccess().getRoomParentRoomCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoomInheritanceDetails"


    // $ANTLR start "entryRuleDeviceInheritance"
    // InternalSmartHome.g:352:1: entryRuleDeviceInheritance returns [EObject current=null] : iv_ruleDeviceInheritance= ruleDeviceInheritance EOF ;
    public final EObject entryRuleDeviceInheritance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceInheritance = null;


        try {
            // InternalSmartHome.g:352:58: (iv_ruleDeviceInheritance= ruleDeviceInheritance EOF )
            // InternalSmartHome.g:353:2: iv_ruleDeviceInheritance= ruleDeviceInheritance EOF
            {
             newCompositeNode(grammarAccess.getDeviceInheritanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceInheritance=ruleDeviceInheritance();

            state._fsp--;

             current =iv_ruleDeviceInheritance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceInheritance"


    // $ANTLR start "ruleDeviceInheritance"
    // InternalSmartHome.g:359:1: ruleDeviceInheritance returns [EObject current=null] : (otherlv_0= 'device' otherlv_1= 'inheritance:' ( (lv_inheritances_2_0= ruleDeviceInheritanceDetails ) )* ) ;
    public final EObject ruleDeviceInheritance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_inheritances_2_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:365:2: ( (otherlv_0= 'device' otherlv_1= 'inheritance:' ( (lv_inheritances_2_0= ruleDeviceInheritanceDetails ) )* ) )
            // InternalSmartHome.g:366:2: (otherlv_0= 'device' otherlv_1= 'inheritance:' ( (lv_inheritances_2_0= ruleDeviceInheritanceDetails ) )* )
            {
            // InternalSmartHome.g:366:2: (otherlv_0= 'device' otherlv_1= 'inheritance:' ( (lv_inheritances_2_0= ruleDeviceInheritanceDetails ) )* )
            // InternalSmartHome.g:367:3: otherlv_0= 'device' otherlv_1= 'inheritance:' ( (lv_inheritances_2_0= ruleDeviceInheritanceDetails ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceInheritanceAccess().getDeviceKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceInheritanceAccess().getInheritanceKeyword_1());
            		
            // InternalSmartHome.g:375:3: ( (lv_inheritances_2_0= ruleDeviceInheritanceDetails ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmartHome.g:376:4: (lv_inheritances_2_0= ruleDeviceInheritanceDetails )
            	    {
            	    // InternalSmartHome.g:376:4: (lv_inheritances_2_0= ruleDeviceInheritanceDetails )
            	    // InternalSmartHome.g:377:5: lv_inheritances_2_0= ruleDeviceInheritanceDetails
            	    {

            	    					newCompositeNode(grammarAccess.getDeviceInheritanceAccess().getInheritancesDeviceInheritanceDetailsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_inheritances_2_0=ruleDeviceInheritanceDetails();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeviceInheritanceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inheritances",
            	    						lv_inheritances_2_0,
            	    						"org.xtext.example.smarthome.SmartHome.DeviceInheritanceDetails");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceInheritance"


    // $ANTLR start "entryRuleDeviceInheritanceDetails"
    // InternalSmartHome.g:398:1: entryRuleDeviceInheritanceDetails returns [EObject current=null] : iv_ruleDeviceInheritanceDetails= ruleDeviceInheritanceDetails EOF ;
    public final EObject entryRuleDeviceInheritanceDetails() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceInheritanceDetails = null;


        try {
            // InternalSmartHome.g:398:65: (iv_ruleDeviceInheritanceDetails= ruleDeviceInheritanceDetails EOF )
            // InternalSmartHome.g:399:2: iv_ruleDeviceInheritanceDetails= ruleDeviceInheritanceDetails EOF
            {
             newCompositeNode(grammarAccess.getDeviceInheritanceDetailsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeviceInheritanceDetails=ruleDeviceInheritanceDetails();

            state._fsp--;

             current =iv_ruleDeviceInheritanceDetails; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceInheritanceDetails"


    // $ANTLR start "ruleDeviceInheritanceDetails"
    // InternalSmartHome.g:405:1: ruleDeviceInheritanceDetails returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDeviceInheritanceDetails() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmartHome.g:411:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalSmartHome.g:412:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalSmartHome.g:412:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) )
            // InternalSmartHome.g:413:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'extends' otherlv_2= 'from' ( (otherlv_3= RULE_ID ) )
            {
            // InternalSmartHome.g:413:3: ( (otherlv_0= RULE_ID ) )
            // InternalSmartHome.g:414:4: (otherlv_0= RULE_ID )
            {
            // InternalSmartHome.g:414:4: (otherlv_0= RULE_ID )
            // InternalSmartHome.g:415:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceInheritanceDetailsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getDeviceInheritanceDetailsAccess().getDeviceChildDeviceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceInheritanceDetailsAccess().getExtendsKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDeviceInheritanceDetailsAccess().getFromKeyword_2());
            		
            // InternalSmartHome.g:434:3: ( (otherlv_3= RULE_ID ) )
            // InternalSmartHome.g:435:4: (otherlv_3= RULE_ID )
            {
            // InternalSmartHome.g:435:4: (otherlv_3= RULE_ID )
            // InternalSmartHome.g:436:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceInheritanceDetailsRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getDeviceInheritanceDetailsAccess().getDeviceParentDeviceCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceInheritanceDetails"


    // $ANTLR start "entryRuleDevice"
    // InternalSmartHome.g:451:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalSmartHome.g:451:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalSmartHome.g:452:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalSmartHome.g:458:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'where' otherlv_3= 'properties:' ( (lv_properties_4_0= ruleProperty ) )* (otherlv_5= 'Actions:' )? ( (lv_actions_6_0= ruleAction ) )* (otherlv_7= 'constraints:' )? ( (lv_exp_8_0= ruleExp ) )* ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_properties_4_0 = null;

        EObject lv_actions_6_0 = null;

        EObject lv_exp_8_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:464:2: ( (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'where' otherlv_3= 'properties:' ( (lv_properties_4_0= ruleProperty ) )* (otherlv_5= 'Actions:' )? ( (lv_actions_6_0= ruleAction ) )* (otherlv_7= 'constraints:' )? ( (lv_exp_8_0= ruleExp ) )* ) )
            // InternalSmartHome.g:465:2: (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'where' otherlv_3= 'properties:' ( (lv_properties_4_0= ruleProperty ) )* (otherlv_5= 'Actions:' )? ( (lv_actions_6_0= ruleAction ) )* (otherlv_7= 'constraints:' )? ( (lv_exp_8_0= ruleExp ) )* )
            {
            // InternalSmartHome.g:465:2: (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'where' otherlv_3= 'properties:' ( (lv_properties_4_0= ruleProperty ) )* (otherlv_5= 'Actions:' )? ( (lv_actions_6_0= ruleAction ) )* (otherlv_7= 'constraints:' )? ( (lv_exp_8_0= ruleExp ) )* )
            // InternalSmartHome.g:466:3: otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'where' otherlv_3= 'properties:' ( (lv_properties_4_0= ruleProperty ) )* (otherlv_5= 'Actions:' )? ( (lv_actions_6_0= ruleAction ) )* (otherlv_7= 'constraints:' )? ( (lv_exp_8_0= ruleExp ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDeviceKeyword_0());
            		
            // InternalSmartHome.g:470:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartHome.g:471:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartHome.g:471:4: (lv_name_1_0= RULE_ID )
            // InternalSmartHome.g:472:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getWhereKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getPropertiesKeyword_3());
            		
            // InternalSmartHome.g:496:3: ( (lv_properties_4_0= ruleProperty ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==12) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>=34 && LA8_0<=35)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmartHome.g:497:4: (lv_properties_4_0= ruleProperty )
            	    {
            	    // InternalSmartHome.g:497:4: (lv_properties_4_0= ruleProperty )
            	    // InternalSmartHome.g:498:5: lv_properties_4_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getDeviceAccess().getPropertiesPropertyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_properties_4_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeviceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_4_0,
            	    						"org.xtext.example.smarthome.SmartHome.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSmartHome.g:515:3: (otherlv_5= 'Actions:' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmartHome.g:516:4: otherlv_5= 'Actions:'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeviceAccess().getActionsKeyword_5());
                    			

                    }
                    break;

            }

            // InternalSmartHome.g:521:3: ( (lv_actions_6_0= ruleAction ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmartHome.g:522:4: (lv_actions_6_0= ruleAction )
            	    {
            	    // InternalSmartHome.g:522:4: (lv_actions_6_0= ruleAction )
            	    // InternalSmartHome.g:523:5: lv_actions_6_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getDeviceAccess().getActionsActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_actions_6_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeviceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_6_0,
            	    						"org.xtext.example.smarthome.SmartHome.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalSmartHome.g:540:3: (otherlv_7= 'constraints:' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmartHome.g:541:4: otherlv_7= 'constraints:'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getDeviceAccess().getConstraintsKeyword_7());
                    			

                    }
                    break;

            }

            // InternalSmartHome.g:546:3: ( (lv_exp_8_0= ruleExp ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_INT)||LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmartHome.g:547:4: (lv_exp_8_0= ruleExp )
            	    {
            	    // InternalSmartHome.g:547:4: (lv_exp_8_0= ruleExp )
            	    // InternalSmartHome.g:548:5: lv_exp_8_0= ruleExp
            	    {

            	    					newCompositeNode(grammarAccess.getDeviceAccess().getExpExpParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_exp_8_0=ruleExp();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeviceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"exp",
            	    						lv_exp_8_0,
            	    						"org.xtext.example.smarthome.SmartHome.Exp");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleAction"
    // InternalSmartHome.g:569:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSmartHome.g:569:47: (iv_ruleAction= ruleAction EOF )
            // InternalSmartHome.g:570:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalSmartHome.g:576:1: ruleAction returns [EObject current=null] : (otherlv_0= 'do' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalSmartHome.g:582:2: ( (otherlv_0= 'do' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalSmartHome.g:583:2: (otherlv_0= 'do' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalSmartHome.g:583:2: (otherlv_0= 'do' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalSmartHome.g:584:3: otherlv_0= 'do' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getDoKeyword_0());
            		
            // InternalSmartHome.g:588:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartHome.g:589:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartHome.g:589:4: (lv_name_1_0= RULE_ID )
            // InternalSmartHome.g:590:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleProperty"
    // InternalSmartHome.g:610:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalSmartHome.g:610:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalSmartHome.g:611:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalSmartHome.g:617:1: ruleProperty returns [EObject current=null] : ( ( (lv_prType_0_0= rulePropertyType ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_prType_0_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:623:2: ( ( ( (lv_prType_0_0= rulePropertyType ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalSmartHome.g:624:2: ( ( (lv_prType_0_0= rulePropertyType ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalSmartHome.g:624:2: ( ( (lv_prType_0_0= rulePropertyType ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalSmartHome.g:625:3: ( (lv_prType_0_0= rulePropertyType ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // InternalSmartHome.g:625:3: ( (lv_prType_0_0= rulePropertyType ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=34 && LA13_0<=35)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSmartHome.g:626:4: (lv_prType_0_0= rulePropertyType )
                    {
                    // InternalSmartHome.g:626:4: (lv_prType_0_0= rulePropertyType )
                    // InternalSmartHome.g:627:5: lv_prType_0_0= rulePropertyType
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getPrTypePropertyTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_prType_0_0=rulePropertyType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"prType",
                    						lv_prType_0_0,
                    						"org.xtext.example.smarthome.SmartHome.PropertyType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSmartHome.g:644:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmartHome.g:645:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmartHome.g:645:4: (lv_name_1_0= RULE_ID )
            // InternalSmartHome.g:646:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getColonKeyword_2());
            		
            // InternalSmartHome.g:666:3: ( (lv_type_3_0= ruleType ) )
            // InternalSmartHome.g:667:4: (lv_type_3_0= ruleType )
            {
            // InternalSmartHome.g:667:4: (lv_type_3_0= ruleType )
            // InternalSmartHome.g:668:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.smarthome.SmartHome.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleExp"
    // InternalSmartHome.g:689:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalSmartHome.g:689:44: (iv_ruleExp= ruleExp EOF )
            // InternalSmartHome.g:690:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalSmartHome.g:696:1: ruleExp returns [EObject current=null] : this_BooleanExp_0= ruleBooleanExp ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExp_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:702:2: (this_BooleanExp_0= ruleBooleanExp )
            // InternalSmartHome.g:703:2: this_BooleanExp_0= ruleBooleanExp
            {

            		newCompositeNode(grammarAccess.getExpAccess().getBooleanExpParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BooleanExp_0=ruleBooleanExp();

            state._fsp--;


            		current = this_BooleanExp_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleBooleanExp"
    // InternalSmartHome.g:714:1: entryRuleBooleanExp returns [EObject current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final EObject entryRuleBooleanExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExp = null;


        try {
            // InternalSmartHome.g:714:51: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // InternalSmartHome.g:715:2: iv_ruleBooleanExp= ruleBooleanExp EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExp=ruleBooleanExp();

            state._fsp--;

             current =iv_ruleBooleanExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExp"


    // $ANTLR start "ruleBooleanExp"
    // InternalSmartHome.g:721:1: ruleBooleanExp returns [EObject current=null] : (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAndCondition ) ) )* ) ;
    public final EObject ruleBooleanExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndCondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:727:2: ( (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAndCondition ) ) )* ) )
            // InternalSmartHome.g:728:2: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAndCondition ) ) )* )
            {
            // InternalSmartHome.g:728:2: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAndCondition ) ) )* )
            // InternalSmartHome.g:729:3: this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAndCondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getBooleanExpAccess().getAndConditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_AndCondition_0=ruleAndCondition();

            state._fsp--;


            			current = this_AndCondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartHome.g:737:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleAndCondition ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSmartHome.g:738:4: () otherlv_2= 'AND' ( (lv_right_3_0= ruleAndCondition ) )
            	    {
            	    // InternalSmartHome.g:738:4: ()
            	    // InternalSmartHome.g:739:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBooleanExpAccess().getANDLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_19); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBooleanExpAccess().getANDKeyword_1_1());
            	    			
            	    // InternalSmartHome.g:749:4: ( (lv_right_3_0= ruleAndCondition ) )
            	    // InternalSmartHome.g:750:5: (lv_right_3_0= ruleAndCondition )
            	    {
            	    // InternalSmartHome.g:750:5: (lv_right_3_0= ruleAndCondition )
            	    // InternalSmartHome.g:751:6: lv_right_3_0= ruleAndCondition
            	    {

            	    						newCompositeNode(grammarAccess.getBooleanExpAccess().getRightAndConditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleAndCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBooleanExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.smarthome.SmartHome.AndCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "entryRuleAndCondition"
    // InternalSmartHome.g:773:1: entryRuleAndCondition returns [EObject current=null] : iv_ruleAndCondition= ruleAndCondition EOF ;
    public final EObject entryRuleAndCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndCondition = null;


        try {
            // InternalSmartHome.g:773:53: (iv_ruleAndCondition= ruleAndCondition EOF )
            // InternalSmartHome.g:774:2: iv_ruleAndCondition= ruleAndCondition EOF
            {
             newCompositeNode(grammarAccess.getAndConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndCondition=ruleAndCondition();

            state._fsp--;

             current =iv_ruleAndCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndCondition"


    // $ANTLR start "ruleAndCondition"
    // InternalSmartHome.g:780:1: ruleAndCondition returns [EObject current=null] : (this_Atomic_0= ruleAtomic ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleAtomic ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleAtomic ) ) ) )* ) ;
    public final EObject ruleAndCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Atomic_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:786:2: ( (this_Atomic_0= ruleAtomic ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleAtomic ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleAtomic ) ) ) )* ) )
            // InternalSmartHome.g:787:2: (this_Atomic_0= ruleAtomic ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleAtomic ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleAtomic ) ) ) )* )
            {
            // InternalSmartHome.g:787:2: (this_Atomic_0= ruleAtomic ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleAtomic ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleAtomic ) ) ) )* )
            // InternalSmartHome.g:788:3: this_Atomic_0= ruleAtomic ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleAtomic ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleAtomic ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndConditionAccess().getAtomicParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Atomic_0=ruleAtomic();

            state._fsp--;


            			current = this_Atomic_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSmartHome.g:796:3: ( ( () otherlv_2= '>' ( (lv_right_3_0= ruleAtomic ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleAtomic ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }
                else if ( (LA15_0==27) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmartHome.g:797:4: ( () otherlv_2= '>' ( (lv_right_3_0= ruleAtomic ) ) )
            	    {
            	    // InternalSmartHome.g:797:4: ( () otherlv_2= '>' ( (lv_right_3_0= ruleAtomic ) ) )
            	    // InternalSmartHome.g:798:5: () otherlv_2= '>' ( (lv_right_3_0= ruleAtomic ) )
            	    {
            	    // InternalSmartHome.g:798:5: ()
            	    // InternalSmartHome.g:799:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getAndConditionAccess().getGTLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_19); 

            	    					newLeafNode(otherlv_2, grammarAccess.getAndConditionAccess().getGreaterThanSignKeyword_1_0_1());
            	    				
            	    // InternalSmartHome.g:809:5: ( (lv_right_3_0= ruleAtomic ) )
            	    // InternalSmartHome.g:810:6: (lv_right_3_0= ruleAtomic )
            	    {
            	    // InternalSmartHome.g:810:6: (lv_right_3_0= ruleAtomic )
            	    // InternalSmartHome.g:811:7: lv_right_3_0= ruleAtomic
            	    {

            	    							newCompositeNode(grammarAccess.getAndConditionAccess().getRightAtomicParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleAtomic();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getAndConditionRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"org.xtext.example.smarthome.SmartHome.Atomic");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSmartHome.g:830:4: ( () otherlv_5= '<' ( (lv_right_6_0= ruleAtomic ) ) )
            	    {
            	    // InternalSmartHome.g:830:4: ( () otherlv_5= '<' ( (lv_right_6_0= ruleAtomic ) ) )
            	    // InternalSmartHome.g:831:5: () otherlv_5= '<' ( (lv_right_6_0= ruleAtomic ) )
            	    {
            	    // InternalSmartHome.g:831:5: ()
            	    // InternalSmartHome.g:832:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getAndConditionAccess().getLTLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,27,FOLLOW_19); 

            	    					newLeafNode(otherlv_5, grammarAccess.getAndConditionAccess().getLessThanSignKeyword_1_1_1());
            	    				
            	    // InternalSmartHome.g:842:5: ( (lv_right_6_0= ruleAtomic ) )
            	    // InternalSmartHome.g:843:6: (lv_right_6_0= ruleAtomic )
            	    {
            	    // InternalSmartHome.g:843:6: (lv_right_6_0= ruleAtomic )
            	    // InternalSmartHome.g:844:7: lv_right_6_0= ruleAtomic
            	    {

            	    							newCompositeNode(grammarAccess.getAndConditionAccess().getRightAtomicParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_20);
            	    lv_right_6_0=ruleAtomic();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getAndConditionRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"org.xtext.example.smarthome.SmartHome.Atomic");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndCondition"


    // $ANTLR start "entryRuleAtomic"
    // InternalSmartHome.g:867:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalSmartHome.g:867:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalSmartHome.g:868:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalSmartHome.g:874:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_value_5_0= ruleParenthesis ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_3=null;
        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:880:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_value_5_0= ruleParenthesis ) ) ) ) )
            // InternalSmartHome.g:881:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_value_5_0= ruleParenthesis ) ) ) )
            {
            // InternalSmartHome.g:881:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) ) | ( () ( (lv_value_5_0= ruleParenthesis ) ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt16=1;
                }
                break;
            case RULE_ID:
                {
                alt16=2;
                }
                break;
            case 28:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalSmartHome.g:882:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalSmartHome.g:882:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalSmartHome.g:883:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalSmartHome.g:883:4: ()
                    // InternalSmartHome.g:884:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getMyNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSmartHome.g:890:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalSmartHome.g:891:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalSmartHome.g:891:5: (lv_value_1_0= RULE_INT )
                    // InternalSmartHome.g:892:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:910:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalSmartHome.g:910:3: ( () ( (otherlv_3= RULE_ID ) ) )
                    // InternalSmartHome.g:911:4: () ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalSmartHome.g:911:4: ()
                    // InternalSmartHome.g:912:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVarRefAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSmartHome.g:918:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSmartHome.g:919:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSmartHome.g:919:5: (otherlv_3= RULE_ID )
                    // InternalSmartHome.g:920:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getValuePropertyCrossReference_1_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSmartHome.g:933:3: ( () ( (lv_value_5_0= ruleParenthesis ) ) )
                    {
                    // InternalSmartHome.g:933:3: ( () ( (lv_value_5_0= ruleParenthesis ) ) )
                    // InternalSmartHome.g:934:4: () ( (lv_value_5_0= ruleParenthesis ) )
                    {
                    // InternalSmartHome.g:934:4: ()
                    // InternalSmartHome.g:935:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getParenthesisAction_2_0(),
                    						current);
                    				

                    }

                    // InternalSmartHome.g:941:4: ( (lv_value_5_0= ruleParenthesis ) )
                    // InternalSmartHome.g:942:5: (lv_value_5_0= ruleParenthesis )
                    {
                    // InternalSmartHome.g:942:5: (lv_value_5_0= ruleParenthesis )
                    // InternalSmartHome.g:943:6: lv_value_5_0= ruleParenthesis
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getValueParenthesisParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleParenthesis();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.xtext.example.smarthome.SmartHome.Parenthesis");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleParenthesis"
    // InternalSmartHome.g:965:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalSmartHome.g:965:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalSmartHome.g:966:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalSmartHome.g:972:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalSmartHome.g:978:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalSmartHome.g:979:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalSmartHome.g:979:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalSmartHome.g:980:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
            		
            pushFollow(FOLLOW_21);
            this_Exp_1=ruleExp();

            state._fsp--;


            			current = this_Exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleType"
    // InternalSmartHome.g:1000:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSmartHome.g:1000:45: (iv_ruleType= ruleType EOF )
            // InternalSmartHome.g:1001:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmartHome.g:1007:1: ruleType returns [EObject current=null] : ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'integer' | lv_name_0_3= 'double' | lv_name_0_4= 'string' ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalSmartHome.g:1013:2: ( ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'integer' | lv_name_0_3= 'double' | lv_name_0_4= 'string' ) ) ) )
            // InternalSmartHome.g:1014:2: ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'integer' | lv_name_0_3= 'double' | lv_name_0_4= 'string' ) ) )
            {
            // InternalSmartHome.g:1014:2: ( ( (lv_name_0_1= 'bool' | lv_name_0_2= 'integer' | lv_name_0_3= 'double' | lv_name_0_4= 'string' ) ) )
            // InternalSmartHome.g:1015:3: ( (lv_name_0_1= 'bool' | lv_name_0_2= 'integer' | lv_name_0_3= 'double' | lv_name_0_4= 'string' ) )
            {
            // InternalSmartHome.g:1015:3: ( (lv_name_0_1= 'bool' | lv_name_0_2= 'integer' | lv_name_0_3= 'double' | lv_name_0_4= 'string' ) )
            // InternalSmartHome.g:1016:4: (lv_name_0_1= 'bool' | lv_name_0_2= 'integer' | lv_name_0_3= 'double' | lv_name_0_4= 'string' )
            {
            // InternalSmartHome.g:1016:4: (lv_name_0_1= 'bool' | lv_name_0_2= 'integer' | lv_name_0_3= 'double' | lv_name_0_4= 'string' )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt17=1;
                }
                break;
            case 31:
                {
                alt17=2;
                }
                break;
            case 32:
                {
                alt17=3;
                }
                break;
            case 33:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalSmartHome.g:1017:5: lv_name_0_1= 'bool'
                    {
                    lv_name_0_1=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getTypeAccess().getNameBoolKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:1028:5: lv_name_0_2= 'integer'
                    {
                    lv_name_0_2=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getTypeAccess().getNameIntegerKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalSmartHome.g:1039:5: lv_name_0_3= 'double'
                    {
                    lv_name_0_3=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getTypeAccess().getNameDoubleKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalSmartHome.g:1050:5: lv_name_0_4= 'string'
                    {
                    lv_name_0_4=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_name_0_4, grammarAccess.getTypeAccess().getNameStringKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_4, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePropertyType"
    // InternalSmartHome.g:1066:1: entryRulePropertyType returns [EObject current=null] : iv_rulePropertyType= rulePropertyType EOF ;
    public final EObject entryRulePropertyType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyType = null;


        try {
            // InternalSmartHome.g:1066:53: (iv_rulePropertyType= rulePropertyType EOF )
            // InternalSmartHome.g:1067:2: iv_rulePropertyType= rulePropertyType EOF
            {
             newCompositeNode(grammarAccess.getPropertyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyType=rulePropertyType();

            state._fsp--;

             current =iv_rulePropertyType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyType"


    // $ANTLR start "rulePropertyType"
    // InternalSmartHome.g:1073:1: rulePropertyType returns [EObject current=null] : ( ( (lv_name_0_1= 'private' | lv_name_0_2= 'public' ) ) ) ;
    public final EObject rulePropertyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalSmartHome.g:1079:2: ( ( ( (lv_name_0_1= 'private' | lv_name_0_2= 'public' ) ) ) )
            // InternalSmartHome.g:1080:2: ( ( (lv_name_0_1= 'private' | lv_name_0_2= 'public' ) ) )
            {
            // InternalSmartHome.g:1080:2: ( ( (lv_name_0_1= 'private' | lv_name_0_2= 'public' ) ) )
            // InternalSmartHome.g:1081:3: ( (lv_name_0_1= 'private' | lv_name_0_2= 'public' ) )
            {
            // InternalSmartHome.g:1081:3: ( (lv_name_0_1= 'private' | lv_name_0_2= 'public' ) )
            // InternalSmartHome.g:1082:4: (lv_name_0_1= 'private' | lv_name_0_2= 'public' )
            {
            // InternalSmartHome.g:1082:4: (lv_name_0_1= 'private' | lv_name_0_2= 'public' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            else if ( (LA18_0==35) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSmartHome.g:1083:5: lv_name_0_1= 'private'
                    {
                    lv_name_0_1=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getPropertyTypeAccess().getNamePrivateKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalSmartHome.g:1094:5: lv_name_0_2= 'public'
                    {
                    lv_name_0_2=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getPropertyTypeAccess().getNamePublicKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000C00300012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000C11C00032L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000011800032L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000032L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});

}