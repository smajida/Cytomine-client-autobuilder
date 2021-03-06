
package be.cytomine.client.abst;

import be.cytomine.client.*;
import java.util.*;
import org.json.simple.*;

import java.util.Date;
import be.cytomine.client.JobParameter;
import be.cytomine.client.Server;
import org.json.simple.JSONObject;


/**
 * A job parameter is an instance of software parameter. When a job is created, we create a job parameter for each software parameter.
 * 
 * @author ClientBuilder (Loïc Rollus)
 * @version 0.1
 * 
 * DO NOT EDIT THIS FILE. THIS IS CODE IS BUILD AUTOMATICALY. ALL CHANGE WILL BE LOST AFTER NEXT GENERATION.
 * 
 * IF YOU WANT TO EDIT A DOMAIN FILE (change method, add property,...), JUST EDIT THE CHILD FILE “YourDomain.java” instead of this file “AbstractYourDomain.java”. I WON'T BE CLEAR IF IT ALREADY EXIST.
 * 
 */
public abstract class AbstractJobParameter
    extends AbstractDomain
{

    /**
     * The full class name of the domain
     * 
     */
    protected String clazz;
    /**
     * The domain id
     * 
     */
    protected Long id;
    /**
     * The date of the domain creation
     * 
     */
    protected Date created;
    /**
     * The date of the domain modification
     * 
     */
    protected Date updated;
    /**
     * When domain was removed from Cytomine
     * 
     */
    protected Date deleted;
    /**
     * Job parameter value
     * 
     */
    protected String value;
    /**
     * The job of the parameter
     * 
     */
    protected Long job;
    /**
     * The parameter id of the software
     * 
     */
    protected Long softwareParameter;
    /**
     * The parameter name
     * 
     */
    protected String name;
    /**
     * The parameter data type (Number, String, Date, Boolean, Domain (e.g: image instance id,...), ListDomain )
     * 
     */
    protected String type;
    /**
     * Index for parameter position. When launching software, parameter will be send ordered by index (asc).
     * 
     */
    protected String index;
    /**
     * Used for UI. If parameter has '(List)Domain' type, the URI will provide a list of choice. E.g. if uri is 'api/project.json', the choice list will be cytomine project list
     * 
     */
    protected String uri;
    /**
     * Used for UI. JSON Fields to print in choice list. E.g. if uri is api/project.json and uriPrintAttribut is 'name', the choice list will contains project name 
     * 
     */
    protected String uriPrintAttribut;
    /**
     * Used for UI. JSON Fields used to sort choice list. E.g. if uri is api/project.json and uriSortAttribut is 'id', projects will be sort by id (not by name) 
     * 
     */
    protected String uriSortAttribut;

    /**
     * 
     * @return
     *     The full class name of the domain
     */
    public String getClazz()
        throws Exception
    {
        return clazz;
    }

    /**
     * 
     * @return
     *     The domain id
     */
    public Long getId()
        throws Exception
    {
        return id;
    }

    /**
     * 
     * @return
     *     The date of the domain creation
     */
    public Date getCreated()
        throws Exception
    {
        return created;
    }

    /**
     * 
     * @return
     *     The date of the domain modification
     */
    public Date getUpdated()
        throws Exception
    {
        return updated;
    }

    /**
     * 
     * @return
     *     When domain was removed from Cytomine
     */
    public Date getDeleted()
        throws Exception
    {
        return deleted;
    }

    /**
     * 
     * @return
     *     Job parameter value
     */
    public String getValue()
        throws Exception
    {
        return value;
    }

    /**
     * 
     * @param value
     *     Job parameter value
     */
    public void setValue(String value)
        throws Exception
    {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The job of the parameter
     */
    public Long getJob()
        throws Exception
    {
        return job;
    }

    /**
     * 
     * @param job
     *     The job of the parameter
     */
    public void setJob(Long job)
        throws Exception
    {
        this.job = job;
    }

    /**
     * 
     * @return
     *     The parameter id of the software
     */
    public Long getSoftwareParameter()
        throws Exception
    {
        return softwareParameter;
    }

    /**
     * 
     * @param softwareParameter
     *     The parameter id of the software
     */
    public void setSoftwareParameter(Long softwareParameter)
        throws Exception
    {
        this.softwareParameter = softwareParameter;
    }

    /**
     * 
     * @return
     *     The parameter name
     */
    public String getName()
        throws Exception
    {
        return name;
    }

    /**
     * 
     * @return
     *     The parameter data type (Number, String, Date, Boolean, Domain (e.g: image instance id,...), ListDomain )
     */
    public String getType()
        throws Exception
    {
        return type;
    }

    /**
     * 
     * @return
     *     Index for parameter position. When launching software, parameter will be send ordered by index (asc).
     */
    public String getIndex()
        throws Exception
    {
        return index;
    }

    /**
     * 
     * @return
     *     Used for UI. If parameter has '(List)Domain' type, the URI will provide a list of choice. E.g. if uri is 'api/project.json', the choice list will be cytomine project list
     */
    public String getUri()
        throws Exception
    {
        return uri;
    }

    /**
     * 
     * @return
     *     Used for UI. JSON Fields to print in choice list. E.g. if uri is api/project.json and uriPrintAttribut is 'name', the choice list will contains project name 
     */
    public String getUriPrintAttribut()
        throws Exception
    {
        return uriPrintAttribut;
    }

    /**
     * 
     * @return
     *     Used for UI. JSON Fields used to sort choice list. E.g. if uri is api/project.json and uriSortAttribut is 'id', projects will be sort by id (not by name) 
     */
    public String getUriSortAttribut()
        throws Exception
    {
        return uriSortAttribut;
    }

    public void build(String value, Long job, Long softwareParameter)
        throws Exception
    {
        
		this.value=value;
		this.job=job;
		this.softwareParameter=softwareParameter;

    
    }

    public void build(JSONObject json)
        throws Exception
    {
        
		this.clazz =JSONUtils.extractJSONString(json.get("class"));
		this.id =JSONUtils.extractJSONLong(json.get("id"));
		this.created =JSONUtils.extractJSONDate(json.get("created"));
		this.updated =JSONUtils.extractJSONDate(json.get("updated"));
		this.deleted =JSONUtils.extractJSONDate(json.get("deleted"));
		this.value =JSONUtils.extractJSONString(json.get("value"));
		this.job =JSONUtils.extractJSONLong(json.get("job"));
		this.softwareParameter =JSONUtils.extractJSONLong(json.get("softwareParameter"));
		this.name =JSONUtils.extractJSONString(json.get("name"));
		this.type =JSONUtils.extractJSONString(json.get("type"));
		this.index =JSONUtils.extractJSONString(json.get("index"));
		this.uri =JSONUtils.extractJSONString(json.get("uri"));
		this.uriPrintAttribut =JSONUtils.extractJSONString(json.get("uriPrintAttribut"));
		this.uriSortAttribut =JSONUtils.extractJSONString(json.get("uriSortAttribut"));

    
    }

    public JSONObject toJSON()
        throws Exception
    {
        
		JSONObject json=new JSONObject();
		json.put("class",JSONUtils.formatJSON(this.clazz));
		json.put("id",JSONUtils.formatJSON(this.id));
		json.put("created",JSONUtils.formatJSON(this.created));
		json.put("updated",JSONUtils.formatJSON(this.updated));
		json.put("deleted",JSONUtils.formatJSON(this.deleted));
		json.put("value",JSONUtils.formatJSON(this.value));
		json.put("job",JSONUtils.formatJSON(this.job));
		json.put("softwareParameter",JSONUtils.formatJSON(this.softwareParameter));
		json.put("name",JSONUtils.formatJSON(this.name));
		json.put("type",JSONUtils.formatJSON(this.type));
		json.put("index",JSONUtils.formatJSON(this.index));
		json.put("uri",JSONUtils.formatJSON(this.uri));
		json.put("uriPrintAttribut",JSONUtils.formatJSON(this.uriPrintAttribut));
		json.put("uriSortAttribut",JSONUtils.formatJSON(this.uriSortAttribut));

		return json;
    
    }

    public static JobParameter get(Server server, Long id)
        throws Exception
    {
        
		String path = "/api/jobparameter/{id}.json?";
		path = path.replace("{id}",id+"");

		JSONObject json = server.doGET(path);
		JobParameter domain = new JobParameter();
		domain.build(json);
		return domain;

    
    }

    public static JobParameter listByJob(Server server, Long id, Integer max, Integer offset)
        throws Exception
    {
        
		throw new Exception("Not yet implemented");
    
    }

    public void add(Server server)
        throws Exception
    {
        
		String path = "/api/jobparameter.json?";
		path = path.replace("{id}",getId()+"");

		JSONObject json = server.doPOST(path,this.toJSON());

		this.build((JSONObject)json.get("jobparameter"));

    
    }

    public static JobParameter list(Server server, Integer max, Integer offset)
        throws Exception
    {
        
		throw new Exception("Not yet implemented");
    
    }

    public void delete(Server server)
        throws Exception
    {
        
		String path = "/api/jobparameter/{id}.json?";
		path = path.replace("{id}",getId()+"");

		server.doDELETE(path);
		build(new JSONObject());

    
    }

    public void edit(Server server)
        throws Exception
    {
        
		String path = "/api/jobparameter/{id}.json?";
		path = path.replace("{id}",getId()+"");

		JSONObject json = server.doPUT(path,this.toJSON());

		this.build((JSONObject)json.get("jobparameter"));

    
    }

}
