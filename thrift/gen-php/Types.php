<?php
namespace ;

/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Exception\TApplicationException;


class CDBDriver {
  static $_TSPEC;

  public $driverName = null;
  public $url = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'driverName',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'url',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['driverName'])) {
        $this->driverName = $vals['driverName'];
      }
      if (isset($vals['url'])) {
        $this->url = $vals['url'];
      }
    }
  }

  public function getName() {
    return 'CDBDriver';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->driverName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->url);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('CDBDriver');
    if ($this->driverName !== null) {
      $xfer += $output->writeFieldBegin('driverName', TType::STRING, 1);
      $xfer += $output->writeString($this->driverName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->url !== null) {
      $xfer += $output->writeFieldBegin('url', TType::STRING, 2);
      $xfer += $output->writeString($this->url);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class CDB {
  static $_TSPEC;

  public $sql = null;
  public $dbHost = null;
  public $dbPort = null;
  public $dbUserName = null;
  public $dbPassword = null;
  public $dbName = null;
  public $driver = null;
  public $prefix = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'sql',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'dbHost',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'dbPort',
          'type' => TType::I32,
          ),
        4 => array(
          'var' => 'dbUserName',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'dbPassword',
          'type' => TType::STRING,
          ),
        6 => array(
          'var' => 'dbName',
          'type' => TType::STRING,
          ),
        7 => array(
          'var' => 'driver',
          'type' => TType::STRUCT,
          'class' => '\CDBDriver',
          ),
        8 => array(
          'var' => 'prefix',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['sql'])) {
        $this->sql = $vals['sql'];
      }
      if (isset($vals['dbHost'])) {
        $this->dbHost = $vals['dbHost'];
      }
      if (isset($vals['dbPort'])) {
        $this->dbPort = $vals['dbPort'];
      }
      if (isset($vals['dbUserName'])) {
        $this->dbUserName = $vals['dbUserName'];
      }
      if (isset($vals['dbPassword'])) {
        $this->dbPassword = $vals['dbPassword'];
      }
      if (isset($vals['dbName'])) {
        $this->dbName = $vals['dbName'];
      }
      if (isset($vals['driver'])) {
        $this->driver = $vals['driver'];
      }
      if (isset($vals['prefix'])) {
        $this->prefix = $vals['prefix'];
      }
    }
  }

  public function getName() {
    return 'CDB';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->sql);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->dbHost);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->dbPort);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->dbUserName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->dbPassword);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->dbName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::STRUCT) {
            $this->driver = new \CDBDriver();
            $xfer += $this->driver->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 8:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->prefix);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('CDB');
    if ($this->sql !== null) {
      $xfer += $output->writeFieldBegin('sql', TType::STRING, 1);
      $xfer += $output->writeString($this->sql);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->dbHost !== null) {
      $xfer += $output->writeFieldBegin('dbHost', TType::STRING, 2);
      $xfer += $output->writeString($this->dbHost);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->dbPort !== null) {
      $xfer += $output->writeFieldBegin('dbPort', TType::I32, 3);
      $xfer += $output->writeI32($this->dbPort);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->dbUserName !== null) {
      $xfer += $output->writeFieldBegin('dbUserName', TType::STRING, 4);
      $xfer += $output->writeString($this->dbUserName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->dbPassword !== null) {
      $xfer += $output->writeFieldBegin('dbPassword', TType::STRING, 5);
      $xfer += $output->writeString($this->dbPassword);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->dbName !== null) {
      $xfer += $output->writeFieldBegin('dbName', TType::STRING, 6);
      $xfer += $output->writeString($this->dbName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->driver !== null) {
      if (!is_object($this->driver)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('driver', TType::STRUCT, 7);
      $xfer += $this->driver->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->prefix !== null) {
      $xfer += $output->writeFieldBegin('prefix', TType::STRING, 8);
      $xfer += $output->writeString($this->prefix);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class CTask {
  static $_TSPEC;

  public $name = null;
  public $cronTime = null;
  public $userName = null;
  public $dbs = null;
  public $batchSaveNum = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'name',
          'type' => TType::I32,
          ),
        2 => array(
          'var' => 'cronTime',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'userName',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'dbs',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\CDB',
            ),
          ),
        5 => array(
          'var' => 'batchSaveNum',
          'type' => TType::I32,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['name'])) {
        $this->name = $vals['name'];
      }
      if (isset($vals['cronTime'])) {
        $this->cronTime = $vals['cronTime'];
      }
      if (isset($vals['userName'])) {
        $this->userName = $vals['userName'];
      }
      if (isset($vals['dbs'])) {
        $this->dbs = $vals['dbs'];
      }
      if (isset($vals['batchSaveNum'])) {
        $this->batchSaveNum = $vals['batchSaveNum'];
      }
    }
  }

  public function getName() {
    return 'CTask';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->name);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->cronTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->userName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::LST) {
            $this->dbs = array();
            $_size0 = 0;
            $_etype3 = 0;
            $xfer += $input->readListBegin($_etype3, $_size0);
            for ($_i4 = 0; $_i4 < $_size0; ++$_i4)
            {
              $elem5 = null;
              $elem5 = new \CDB();
              $xfer += $elem5->read($input);
              $this->dbs []= $elem5;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->batchSaveNum);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('CTask');
    if ($this->name !== null) {
      $xfer += $output->writeFieldBegin('name', TType::I32, 1);
      $xfer += $output->writeI32($this->name);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->cronTime !== null) {
      $xfer += $output->writeFieldBegin('cronTime', TType::STRING, 2);
      $xfer += $output->writeString($this->cronTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->userName !== null) {
      $xfer += $output->writeFieldBegin('userName', TType::STRING, 3);
      $xfer += $output->writeString($this->userName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->dbs !== null) {
      if (!is_array($this->dbs)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('dbs', TType::LST, 4);
      {
        $output->writeListBegin(TType::STRUCT, count($this->dbs));
        {
          foreach ($this->dbs as $iter6)
          {
            $xfer += $iter6->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->batchSaveNum !== null) {
      $xfer += $output->writeFieldBegin('batchSaveNum', TType::I32, 5);
      $xfer += $output->writeI32($this->batchSaveNum);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

