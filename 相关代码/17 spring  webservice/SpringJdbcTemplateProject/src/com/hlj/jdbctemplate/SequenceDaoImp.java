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
	public PayReceiptDetialEO getByObjectSql() {

	    String sql = "SELECT * from CSIP_OA_PAYLISTINFO cop where cop.INNER_LISTNO = 'w201704210000704'" ;

	    PayReceiptDetialEO payReceiptDetialEO = jdbcTemplate.queryForObject(sql,  new BeanPropertyRowMapper<PayReceiptDetialEO>(PayReceiptDetialEO.class));
		 
		return payReceiptDetialEO;
	}

	
	
}
