package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Userswitch.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserSwitch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getUserSwitch", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userSwitch", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserswitchKt {
    private static ImageVector _userSwitch;

    public static final ImageVector getUserSwitch(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _userSwitch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserSwitch", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(250.83f, 130.83f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f);
        pathBuilder.lineToRelative(-24.0f, -24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, -5.66f);
        pathBuilder.lineTo(220.0f, 142.34f);
        pathBuilder.lineTo(220.0f, 128.0f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, false, 53.25f, 74.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.5f, -4.68f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, false, true, 228.0f, 128.0f);
        pathBuilder.verticalLineToRelative(14.34f);
        pathBuilder.lineToRelative(17.17f, -17.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(209.23f, 186.34f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, false, true, 28.0f, 128.0f);
        pathBuilder.lineTo(28.0f, 113.66f);
        pathBuilder.lineTo(10.83f, 130.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.lineToRelative(24.0f, 24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.lineTo(36.0f, 113.66f);
        pathBuilder.lineTo(36.0f, 128.0f);
        pathBuilder.arcToRelative(91.69f, 91.69f, 0.0f, false, false, 26.83f, 64.87f);
        pathBuilder.arcToRelative(75.61f, 75.61f, 0.0f, false, true, 44.51f, -34.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, true, 41.32f, 0.0f);
        pathBuilder.arcToRelative(75.57f, 75.57f, 0.0f, false, true, 44.52f, 34.07f);
        pathBuilder.arcToRelative(91.34f, 91.34f, 0.0f, false, false, 9.56f, -11.24f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.49f, 4.68f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 156.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(92.23f, 92.23f, 0.0f, false, false, 59.14f, -21.57f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, -118.27f, 0.0f);
        pathBuilder.arcTo(91.56f, 91.56f, 0.0f, false, false, 128.0f, 220.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userSwitch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
