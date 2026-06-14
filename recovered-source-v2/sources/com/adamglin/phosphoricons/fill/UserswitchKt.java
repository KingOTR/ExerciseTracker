package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Userswitch.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserSwitch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getUserSwitch", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userSwitch", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserswitchKt {
    private static ImageVector _userSwitch;

    public static final ImageVector getUserSwitch(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(84.0f, 120.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, 44.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 84.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.16f, 177.18f);
        pathBuilder.arcToRelative(8.21f, 8.21f, 0.0f, false, false, -10.86f, 2.41f);
        pathBuilder.arcToRelative(87.42f, 87.42f, 0.0f, false, true, -5.52f, 6.85f);
        pathBuilder.arcTo(79.76f, 79.76f, 0.0f, false, false, 172.0f, 165.1f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.84f, 0.32f);
        pathBuilder.arcToRelative(59.8f, 59.8f, 0.0f, false, true, -78.26f, 0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 84.0f, 165.1f);
        pathBuilder.arcToRelative(79.71f, 79.71f, 0.0f, false, false, -21.79f, 21.31f);
        pathBuilder.arcTo(87.66f, 87.66f, 0.0f, false, true, 40.37f, 136.0f);
        pathBuilder.horizontalLineToRelative(15.4f);
        pathBuilder.arcToRelative(8.2f, 8.2f, 0.0f, false, false, 6.69f, -3.28f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.8f, -10.38f);
        pathBuilder.lineToRelative(-24.0f, -24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.8f, 10.38f);
        pathBuilder.arcTo(8.2f, 8.2f, 0.0f, false, false, 8.23f, 136.0f);
        pathBuilder.lineTo(24.3f, 136.0f);
        pathBuilder.arcToRelative(104.0f, 104.0f, 0.0f, false, false, 188.18f, 52.67f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 210.16f, 177.18f);
        pathBuilder.close();
        pathBuilder.moveTo(255.39f, 124.94f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 120.0f);
        pathBuilder.lineTo(231.7f, 120.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 43.52f, 67.33f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.0f, 9.34f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 215.63f, 120.0f);
        pathBuilder.lineTo(200.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f);
        pathBuilder.lineToRelative(24.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 255.39f, 124.94f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userSwitch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
