/*
 * Distributed as part of c3p0 v.0.9.1.2
 *
 * Copyright (C) 2005 Machinery For Change, Inc.
 *
 * Author: Steve Waldman <swaldman@mchange.com>
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 2.1, as 
 * published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this software; see the file LICENSE.  If not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 */


package com.mchange.v1.io;

import com.mchange.v2.log.*;
import java.io.OutputStream;
import java.io.IOException;

public final class OutputStreamUtils
{
    private final static MLogger logger = MLog.getLogger( OutputStreamUtils.class );

    public static void attemptClose(OutputStream os)
    {
      try
	  {if (os != null) os.close();}
      catch (IOException e)
	  {
		if ( logger.isLoggable( MLevel.WARNING ) )
		    logger.log( MLevel.WARNING, "OutputStream close FAILED.", e );
	      //e.printStackTrace();
	  }
    }

  private OutputStreamUtils()
    {}
}
