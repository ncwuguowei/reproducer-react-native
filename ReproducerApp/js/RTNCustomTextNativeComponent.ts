import type {ViewProps} from 'ViewPropTypes';
import type {HostComponent} from 'react-native';
import codegenNativeComponent from 'react-native/Libraries/Utilities/codegenNativeComponent';

export interface NativeProps extends ViewProps {
  text?: string;
  // 添加其它 props
  textColor?: string
}

export default codegenNativeComponent<NativeProps>(
  'RTNCustomText',
) as HostComponent<NativeProps>;