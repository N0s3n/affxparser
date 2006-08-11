////////////////////////////////////////////////////////////////
//
// Copyright (C) 2005 Affymetrix, Inc.
//
// This program is free software; you can redistribute it and/or modify 
// it under the terms of the GNU General Public License (version 2) as 
// published by the Free Software Foundation.
// 
// This program is distributed in the hope that it will be useful, 
// but WITHOUT ANY WARRANTY; without even the implied warranty of 
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
// General Public License for more details.
// 
// You should have received a copy of the GNU General Public License 
// along with this program;if not, write to the 
// 
// Free Software Foundation, Inc., 
// 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
//
////////////////////////////////////////////////////////////////

/**
 * @file   Convert.cpp
 * @author Chuck Sugnet
 * @date   Wed May  4 15:24:08 2005
 * 
 * @brief  Definitions for Convert class.
 * 
 */

#include <assert.h>
#include <errno.h>
#include <math.h>
#include <sstream>
#include <stdlib.h>
#include <string>
#include <limits.h>
#include <float.h>
#include "util/Err.h"
#include "Convert.h"

using namespace std;

/** 
 * Make a string from an integer.
 * @param i - integer to be converted.
 * 
 * @return - String version of int i;
 */
string Convert::toString(int i) {
  stringstream ss;
  string str;
  ss << i;
  ss >> str;
  return str;
}

/** 
 * Make a string from an double
 * @param d - double to be converted.
 * 
 * @return - String version of int i;
 */
string Convert::toString(double d) {
  stringstream ss;
  string str;
  ss << d;
  ss >> str;
  return str;
}

/** 
 * Make an int from a c string or die trying.
 * @param num - c string representation of number to be parsed.
 * 
 * @return - Integer representation of num
 */
int Convert::toInt(const char *num) {
  bool success = true;
  int i = Convert::toIntCheck(num, &success);
  if(success != true)
    Err::errAbort("Could not convert '" + std::string(num) + "' to an int.");
  return i;
}

/** 
 * Make an int from a c string.
 * @param num - c string representation of number to be parsed.
 * @param success - If success != NULL set to true upon 
 *   successful conversion and false upon failur.
 * @return - Integer representation of num, 0 if success == false
 */
int Convert::toIntCheck(const char *num, bool *success) {
  long int l = 0;
  int i = 0;
  bool ok = true;
  char *end = NULL;

  assert(num); 
  errno = 0;
  l = strtol(num, &end, 10);

  // end will be NULL if entire string converted.
  ok = (*end != '\0' || end == num) ? false : true;
  
  // cast to int and make sure that we didn't overflow
  i = (int)l;
  if(errno != 0 || (long)i != l || l >= INT_MAX || l <= INT_MIN) 
    ok = false;

  // if we had a problem set to 0 for consistency.
  if(!ok)
    i = 0;

  if(success != NULL)
    (*success) = ok;

  return i;
}

/** 
 * Make an uint from a c string or die trying.
 * @param num - c string representation of number to be parsed.
 * 
 * @return - Unsigned Integer representation of num
 */
unsigned int Convert::toUnsignedInt(const char *num) {
  bool success = true;
  unsigned int i = Convert::toUnsignedIntCheck(num, &success);
  if(success != true)
    Err::errAbort("Could not convert '" + std::string(num) + "' to an unsigned int.");
  return i;
}

/** 
 * Make an unsigned int from a c string.
 * @param num - c string representation of number to be parsed.
 * @param success - If success != NULL set to true upon 
 *   successful conversion and false upon failur.
 * @return - Unsigned Integer representation of num, 0 if success == false
 */
unsigned int Convert::toUnsignedIntCheck(const char *num, bool *success) {
  long unsigned int l = 0;
  unsigned int i = 0;
  bool ok = true;
  char *end = NULL;

  assert(num); 
  errno = 0;
  l = strtoul(num, &end, 10);

  // end will be NULL if entire string converted.
  ok = (*end != '\0' || end == num) ? false : true;

  // cast to unsigned int and make sure that we didn't overflow
  i = (unsigned int)l;
  if(errno != 0 || (long unsigned int)i != l || l >= UINT_MAX) 
    ok = false;

  // if we had a problem set to 0 for consistency.
  if(!ok)
    i = 0;

  if(success != NULL)
    (*success) = ok;

  return i;
}

/** 
 * Make an float from a c string.
 * @param num - c string representation of number to be parsed.
 * 
 * @return - Float representation of num
 */
float Convert::toFloat(const char *num) {
  bool success = true;
  float f = toFloatCheck(num, &success);
  if(!success) 
    Err::errAbort("Could not convert '" + std::string(num) + "' to a float.");
  return f;
}

/** 
 * Make an float from a c string.
 * @param num - c string representation of number to be parsed.
 * @param success - If success != NULL set to true upon 
 *   successful conversion and false upon failur.
 * @return - Float representation of num
 */
float Convert::toFloatCheck(const char *num, bool *success) {
  double d = toDoubleCheck(num, success);
  if(d >= FLT_MAX && d < DBL_MAX)
    (*success) = false;
  return float(d);
}

/** 
 * Make an double from a c string.
 * @param num - c string representation of number to be parsed.
 * 
 * @return - Double representation of num
 */
double Convert::toDouble(const char *num){
  bool success = true;
  double d = Convert::toDoubleCheck(num, &success);

  if(!success)
    Err::errAbort("Could not convert '" + std::string(num) + "' to a double.");

  return d;
}

/** 
 * Make an double from a c string.
 * @param num - c string representation of number to be parsed.
 * @param success - If success != NULL set to true upon 
 *   successful conversion and false upon failur.
 * @return - Double representation of num
 */
double Convert::toDoubleCheck(const char *num, bool *success){
  double d = 0;
  char *end = NULL;
  bool ok = true;

  assert(num);
  errno = 0;
  d = strtod(num, &end);

  // end will point at NULL if conversion successful
  ok = (*end != '\0' || end == num ) ? false : true;

  // errno should be set if over/under flow.
  if(errno != 0)
    ok = false;
  
  if(!ok)
    d = 0.0;

  if(success != NULL)
    (*success) = ok;

  return d;
}

/** 
 * Make an bool from a c string.
 * @param flag - c string representation of number to be parsed.
 *    allowed value are 'true' && 'false'
 * @return - Bool representation of flag
 */
bool Convert::toBool(const char *flag) {
  bool value = false, success = false;
  value = Convert::toBoolCheck(flag, &success);
  if(!success)
    Err::errAbort("Could not convert '" + std::string(flag) + "' to a bool.");
  return value;
}

/** 
 * Make an bool from a c string.
 * @param flag - c string representation of number to be parsed.
 *   allowed value are 'true' && 'false'
 * @param success - If success != NULL set to true upon 
 *   successful conversion and false upon failur.
 * @return - Bool representation of flag, false on failure.
 */
bool Convert::toBoolCheck(const char *flag, bool *success) {
  bool value = false;
  bool ok = true;

  assert(flag);
  if(strcmp(flag, "true") == 0 || strcmp(flag, "TRUE") == 0) 
    value = true;
  else if(strcmp(flag, "false") == 0 || strcmp(flag, "FALSE") == 0) 
    value = false;
  else 
    ok = false;

  if(success != NULL)
    (*success) = ok;

  return value;
}

/** 
 * Test to make sure that two doubles are pretty similar.
 * @param f1 
 * @param f2 
 * @return true if doubles are same to 6 significant digits.
 */
bool Convert::doubleCloseEnough(double d1, double d2, int digits) {
  double diff = fabs(d1 - d2);
  if(diff < 1 / (pow(10.0, (double)digits)))
    return true;
  return false;
}
