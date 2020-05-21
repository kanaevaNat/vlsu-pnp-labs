package com.Laba7;

import java.util.Collection;

public class IsclNode implements AbstractNode{
    private final Collection<AbstractNode> list;
 	    public IsclNode(Collection<AbstractNode> list) {
	        this.list = list;
 	    }
 	    public boolean calculate() {
			boolean result = Boolean.parseBoolean(null);
 	        for(AbstractNode node : list)
 	        {
				result ^= node.calculate();
 	        }
 	        return result;
 	    }
  	    public String toString() {
 	        String result = "";
 	        boolean first = true;

 	        for(AbstractNode node : list)
 	        {
 	            if(!first) result += "^";
 	            first = false;

 	            result += "(" + node + ")";
 	        }
 	        return result;
 	    }
}

