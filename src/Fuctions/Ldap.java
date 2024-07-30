package Fuctions;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

public class Ldap {
	public void totalUser() throws NamingException
	{
		
		Properties initialProperties = new Properties();
		initialProperties.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        initialProperties.put(Context.PROVIDER_URL, "ldap://wissind.com");
        initialProperties.put(Context.SECURITY_AUTHENTICATION, "simple");
        initialProperties.put(Context.SECURITY_PRINCIPAL, "svc_keylock"); // BIND DN
        initialProperties.put(Context.SECURITY_CREDENTIALS, "Cr1tic@lT0u5e"); // BIND Credentials
		InitialDirContext  context = new InitialDirContext(initialProperties);
		
		String searchFilter="(objectClass=inetOrgPerson)";
		String[] requiredAttributes={"cn","mail","facsimileTelephoneNumber"  };
		SearchControls controls=new SearchControls();
		controls.setSearchScope(SearchControls.SUBTREE_SCOPE);
		controls.setReturningAttributes(requiredAttributes);
		NamingEnumeration users=context.search("ou=wissen,dc=wissind,dc=com", searchFilter, controls);
		SearchResult searchResult=null;
		String commonName=null;
		String mail=null;
		String employeeId=null;
		while(users.hasMore())
		{
			
			searchResult=(SearchResult) users.next();
			Attributes attr=searchResult.getAttributes();
			
			commonName=attr.get("cn").get(0).toString();
			mail=attr.get("mail").get(0).toString();
			employeeId=attr.get("facsimileTelephoneNumber").get(0).toString();
			System.out.println("Name = "+commonName);
			System.out.println("mail  = "+mail);
			System.out.println("Employee id = "+employeeId);
			
			
		}
		
	}
		public static void main(String[] args) throws NamingException  
	{
			Ldap sample = new Ldap();
		sample.totalUser();
		
	}

}
