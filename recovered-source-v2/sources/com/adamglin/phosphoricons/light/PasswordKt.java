package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Password.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Password", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPassword", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_password", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PasswordKt {
    private static ImageVector _password;

    public static final ImageVector getPassword(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _password;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Password", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(46.0f, 56.0f);
        pathBuilder.lineTo(46.0f, 200.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(34.0f, 56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.58f, 112.41f);
        pathBuilder.lineTo(118.0f, 119.74f);
        pathBuilder.lineTo(118.0f, 96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(23.74f);
        pathBuilder.lineToRelative(-22.58f, -7.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.71f, 11.41f);
        pathBuilder.lineToRelative(22.58f, 7.33f);
        pathBuilder.lineToRelative(-14.0f, 19.21f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.7f, 7.06f);
        pathBuilder.lineToRelative(14.0f, -19.21f);
        pathBuilder.lineToRelative(14.0f, 19.21f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.7f, -7.06f);
        pathBuilder.lineToRelative(-14.0f, -19.21f);
        pathBuilder.lineToRelative(22.58f, -7.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.71f, -11.41f);
        pathBuilder.close();
        pathBuilder.moveTo(244.14f, 116.26f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.56f, -3.85f);
        pathBuilder.lineTo(214.0f, 119.74f);
        pathBuilder.lineTo(214.0f, 96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(23.74f);
        pathBuilder.lineToRelative(-22.58f, -7.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.71f, 11.41f);
        pathBuilder.lineToRelative(22.58f, 7.33f);
        pathBuilder.lineToRelative(-13.95f, 19.21f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.7f, 7.06f);
        pathBuilder.lineToRelative(14.0f, -19.21f);
        pathBuilder.lineToRelative(14.0f, 19.21f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.7f, -7.06f);
        pathBuilder.lineToRelative(-13.95f, -19.21f);
        pathBuilder.lineToRelative(22.58f, -7.33f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 244.14f, 116.26f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _password = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
