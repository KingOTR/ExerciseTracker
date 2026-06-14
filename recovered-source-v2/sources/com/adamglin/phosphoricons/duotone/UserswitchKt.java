package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Userswitch.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserSwitch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getUserSwitch", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userSwitch", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserswitchKt {
    private static ImageVector _userSwitch;

    public static final ImageVector getUserSwitch(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 128.0f);
        pathBuilder.arcToRelative(95.76f, 95.76f, 0.0f, false, true, -31.8f, 71.37f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, false, 128.0f, 160.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -40.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, false, -64.2f, 39.37f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, true, true, 224.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(253.66f, 133.66f);
        pathBuilder2.lineToRelative(-24.0f, 24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder2.lineToRelative(-24.0f, -24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder2.lineTo(216.0f, 132.69f);
        pathBuilder2.lineTo(216.0f, 128.0f);
        pathBuilder2.arcTo(88.0f, 88.0f, 0.0f, false, false, 56.49f, 76.67f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.0f, -9.34f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, false, true, 232.0f, 128.0f);
        pathBuilder2.verticalLineToRelative(4.69f);
        pathBuilder2.lineToRelative(10.34f, -10.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(212.48f, 188.66f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, false, true, 24.0f, 128.0f);
        pathBuilder2.verticalLineToRelative(-4.69f);
        pathBuilder2.lineTo(13.66f, 133.66f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 2.34f, 122.34f);
        pathBuilder2.lineToRelative(24.0f, -24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f);
        pathBuilder2.lineToRelative(24.0f, 24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder2.lineTo(40.0f, 123.31f);
        pathBuilder2.lineTo(40.0f, 128.0f);
        pathBuilder2.arcToRelative(87.62f, 87.62f, 0.0f, false, false, 22.24f, 58.41f);
        pathBuilder2.arcTo(79.66f, 79.66f, 0.0f, false, true, 98.3f, 157.66f);
        pathBuilder2.arcToRelative(48.0f, 48.0f, 0.0f, true, true, 59.4f, 0.0f);
        pathBuilder2.arcToRelative(79.59f, 79.59f, 0.0f, false, true, 36.08f, 28.78f);
        pathBuilder2.arcToRelative(89.68f, 89.68f, 0.0f, false, false, 5.71f, -7.11f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.0f, 9.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 152.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 152.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 216.0f);
        pathBuilder2.arcToRelative(88.2f, 88.2f, 0.0f, false, false, 53.92f, -18.49f);
        pathBuilder2.arcToRelative(64.0f, 64.0f, 0.0f, false, false, -107.84f, 0.0f);
        pathBuilder2.arcTo(87.57f, 87.57f, 0.0f, false, false, 128.0f, 216.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userSwitch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
