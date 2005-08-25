/////////////////////////////////////////////////////////////////
//
// Copyright (C) 2005 Affymetrix, Inc.
//
// This library is free software; you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published
// by the Free Software Foundation; either version 2.1 of the License,
// or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful, but
// WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
// or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
// for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with this library; if not, write to the Free Software Foundation, Inc.,
// 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA 
//
/////////////////////////////////////////////////////////////////

/*! \file CDFDataTypes.h This file defines the type used by the CDF data headers.
 */

#ifndef _CDFDataTypes_HEADER_
#define _CDFDataTypes_HEADER_

namespace affymetrix_calvin_io
{

/*! Data dataSet column data types */
enum CDFDataTypeIds {
	Expression,		/*! An expression probe set. */
	Genotyping,		/*! A genotyping probe set. */
	Tag,			/*! A tag (also called universal) probe set. */
	Resequencing,	/*! A resequencing probe set. */
	Control			/*! A control probe set. */
};

/*! The direction of the target sequence the probes are designed to interrogate.  */
enum DirectionType
{
	/*! No direction specified */
	ProbeNoDirection,

	/*! Sense */
	ProbeSenseDirection,

	/*! Anti sense */
	ProbeAntiSenseDirection
};

}

#endif