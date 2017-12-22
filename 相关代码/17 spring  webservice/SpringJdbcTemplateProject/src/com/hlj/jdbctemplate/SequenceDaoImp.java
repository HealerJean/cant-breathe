package com.hlj.jdbctemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class SequenceDaoImp implements ISequenceDao {
	 
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public String getBatchNo() {
		return get("batchno_sequence", String.class);
	}
	 
	@Override
	public String getAppseriono() {
		return jdbcTemplate.queryForObject("select lpad(appseriono_sequence.nextval, 20, '0') from dual", String.class);
	}
	 
	@Override
	public String getSerialNo() {
		return get("serial_no_sequence", String.class);
	}
	 
	@Override
	public <T> T get(String sequence, Class<T> clazz) {
		String sql = "select " + sequence + ".nextval from dual";
		return jdbcTemplate.queryForObject(sql, clazz);
	}

	@Override
	public String getContriApplyNo() {
		return jdbcTemplate.queryForObject("select 'JF'||lpad(contriapplyno_sequence.nextval, 6, '0') from dual", String.class);
	}

	@Override
	public String getInsnId() {
		return jdbcTemplate.queryForObject("select lpad(APPSERIONO_CCB_SEQUENCE.nextval, 6, '0') from dual", String.class);
	}

	@Override
	public String getRefNo() {
		
		return jdbcTemplate.queryForObject(" select to_char(sysdate,'yyyymmdd')||lpad(Ref_NO_SEQUENCE.Nextval,6,'0') from dual", String.class);
	}

	@Override
	public String getFlowNo() {
		return jdbcTemplate.queryForObject(" select 'w'||to_char(sysdate,'yyyymmdd')||lpad(Flow_NO_SEQUENCE.Nextval,7,'0') from dual", String.class);
	}

	@Override
	public String getappno() {
		
		return jdbcTemplate.queryForObject(" SELECT lpad(APP_NO_SEQUENCE.Nextval,9,'0') FROM dual", String.class);
	}

	@Override
	public List<PayReceiptDetialEO> getBySql() {

		 String sql =

		    		"SELECT cp.ssid AS ssid," +
		    		      " cp.planid AS planid," +
		    		      " cp.num AS NUM," +
		    		      " cp.personid AS personid," +
		    		      " cp.ssnum AS ssnum," +
		    		      " cp.idtype AS idtype," +
		    		      " cp.idno AS idno," +
		    		      " cp.staffname AS staffname," +
		    		      " cp.benebankid AS bankType," +
		    		      " cp.beneBankBranchId AS bankId," +
		    		      " cp.accno AS accno," +
		    		      " cp.accname AS accname," +
		    		      " cp.PAYSUMUNTAX AS PAYSUMUNTAX," +
		    		      " cp.PAYTAX AS PAYTAX," +
		    		      " cp.payaftersum AS payAmt," +
		    			  " cp.RETRYFLAG AS RETRYFLAG,\n" +  //失败重发标识
		    		      " cp.benetype AS benetype," +
		    		      " cp.memo AS memo," +
		    			  " case cp.ssid when '4124768' then '0' else'1' end as flag, "+
		    		      " case cp.ssid when '4124768' then '3001' else '0000' end  as retCode,"+
		    		      " to_char(sysdate,'yyyyMMdd') as drawDate,"+
		    		      " to_char(sysdate,'HH24mmss') as drawTime"+
		    		  " FROM CSIP_OA_PAYLISTINFO CPI" +
		    		 " JOIN CSIP_OA_TASKFILE CT" +
		    		   " ON CPI.PK_PAYLISTINFO = CT.PK_PAYLISTINFO" +
		    		 " JOIN CSIP_OA_PAYLIST CP" +
		    		   " ON CP.PK_TASKFILE = CT.PK_TASKFILE" +
		    		" WHERE CPI.INNER_LISTNO = 'w201704210000704'" ;

		    
			List<PayReceiptDetialEO> rows = jdbcTemplate.query(sql,new BeanPropertyRowMapper<PayReceiptDetialEO>(PayReceiptDetialEO.class));
		
		return rows;
	}

	@Override
	public Object getByObjectSql() {

/*			String sql="select "
					+ "'123' as planid, "
					+ "'123' as accountplanid,"
					+ "'123' as planlicid,"
					+ "'123' as trustorid,"
					+ "'123' as trustorname,"
					+ "'123' as contributionnotno,"
					+ "'123' as collecttype,"
					+ "'123' as drawamount,"
					+ "'123' as currency,"
					+ "'123' as trustaccname,"
					+ "'123' as trustaccno,"
					+ "'123' as custodian,"
					+ "'123' as custaccountbankid,"
					+ "'123' as payserial,"
					+ "'123' as payserial,"
					+ "'123' as paybank,"
					+ "'123' as paybankid,"
					+ "'123' as paybankaccname,"
					+ "'123' as paybankaccno,"
					+ "'123' as paybankprov,"
					+ "'123' as paybankcity,"
					+ "'123' as Contribution,"
					+ "'123' as paidupamt,"
					+ "'123' as paidupdate,"
					+ "'123' as paidupflag,"
					+ "'123' as paidupnotno,"
					+ "'123' as memo,"
					+ "'123' as ts"
					+ " from dual";*/
			
			String sql="select * from CSIP_OA_CONTRICONFIRM  where  ROWNUM <= 1";
			
			
			ContriConfmSetListEO confmSetListEO = jdbcTemplate.queryForObject(sql,  new BeanPropertyRowMapper<ContriConfmSetListEO>(ContriConfmSetListEO.class));
			 System.out.println(confmSetListEO.toString());
		  
		return confmSetListEO;
	}

	
	
}
